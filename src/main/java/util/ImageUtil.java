package util;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class ImageUtil {

    /**
     * @param fileUrl
     *            文件绝对路径或相对路径
     * @return 读取到的缓存图像
     * @throws IOException
     *             路径错误或者不存在该文件时抛出IO异常
     */
    public static BufferedImage getBufferedImage(String fileUrl)
            throws IOException {
        File f = new File(fileUrl);
        return ImageIO.read(f);
    }

    /**
     * @param savedImg
     *            待保存的图像
     * @param saveDir
     *            保存的目录
     * @param fileName
     *            保存的文件名，必须带后缀，比如 "beauty.jpg"
     * @param format
     *            文件格式：jpg、png或者bmp
     * @return
     */
    public static boolean saveImage(BufferedImage savedImg, String saveDir,
                                    String fileName, String format) {
        boolean flag = false;

        // 先检查保存的图片格式是否正确
        String[] legalFormats = { "jpg", "JPG", "png", "PNG", "bmp", "BMP" };
        int i = 0;
        for (i = 0; i < legalFormats.length; i++) {
            if (format.equals(legalFormats[i])) {
                break;
            }
        }
        if (i == legalFormats.length) { // 图片格式不支持
            System.out.println("不是保存所支持的图片格式!");
            return false;
        }

        // 再检查文件后缀和保存的格式是否一致
        String postfix = fileName.substring(fileName.lastIndexOf('.') + 1);
        if (!postfix.equalsIgnoreCase(format)) {
            System.out.println("待保存文件后缀和保存的格式不一致!");
            return false;
        }

        String fileUrl = saveDir + fileName;
        File file = new File(fileUrl);
        try {
            flag = ImageIO.write(savedImg, format, file);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return flag;
    }

    public static BufferedImage mergeImage(boolean isHorizontal, BufferedImage... imgs) {
        if(imgs.length == 0) {
            return null;
        }
        int wCul = 0; // total width
        int hCul = 0; // total height
        int w = 0; // single width
        int h = 0; // single height
        for(BufferedImage bi : imgs) {
            if(w == 0) {
                w = bi.getWidth();
            }
            if(h == 0) {
                h = bi.getHeight();
            }
            wCul += bi.getWidth();
            hCul += bi.getHeight();
        }
        BufferedImage DestImage = null;
        if (isHorizontal) { // 水平方向合并
            DestImage = new BufferedImage(wCul, h, BufferedImage.TYPE_INT_RGB);
            int tmpW = 0;
            for (BufferedImage bi : imgs) {
                int[] imageArray = getImageArray(bi);
                DestImage.setRGB(tmpW, 0, bi.getWidth(), bi.getHeight()
                        , imageArray, 0, bi.getWidth()); // 设置上半部分或左半部分的RGB
                tmpW += bi.getWidth();
            }
        } else { // 垂直方向合并
            DestImage = new BufferedImage(w, hCul,
                    BufferedImage.TYPE_INT_RGB);
            int tmpH = 0;
            for (BufferedImage bi : imgs) {
                int[] imageArray = getImageArray(bi);
                DestImage.setRGB(0, tmpH, bi.getWidth(), bi.getHeight()
                        , imageArray, 0, bi.getWidth()); // 设置上半部分或左半部分的RGB
                tmpH += bi.getHeight();
            }
        }

        return DestImage;
    }

    private static int[] getImageArray(BufferedImage bi) {
        int[] imageArray = new int[bi.getWidth() * bi.getHeight()];
        imageArray = bi.getRGB(0, 0, bi.getWidth(), bi.getHeight(), imageArray, 0, bi.getWidth());
        return imageArray;
    }

    /**
     * 待合并的两张图必须满足这样的前提，如果水平方向合并，则高度必须相等；如果是垂直方向合并，宽度必须相等。
     * mergeImage方法不做判断，自己判断。
     *
     * @param img1
     *            待合并的第一张图
     * @param img2
     *            带合并的第二张图
     * @param isHorizontal
     *            为true时表示水平方向合并，为false时表示垂直方向合并
     * @return 返回合并后的BufferedImage对象
     * @throws IOException
     */
    public static BufferedImage mergeImage(BufferedImage img1,
                                           BufferedImage img2, boolean isHorizontal) throws IOException {
        int w1 = img1.getWidth();
        int h1 = img1.getHeight();
        int w2 = img2.getWidth();
        int h2 = img2.getHeight();

        // 从图片中读取RGB
        int[] ImageArrayOne = new int[w1 * h1];
        ImageArrayOne = img1.getRGB(0, 0, w1, h1, ImageArrayOne, 0, w1); // 逐行扫描图像中各个像素的RGB到数组中
        int[] ImageArrayTwo = new int[w2 * h2];
        ImageArrayTwo = img2.getRGB(0, 0, w2, h2, ImageArrayTwo, 0, w2);

        // 生成新图片
        BufferedImage DestImage = null;
        if (isHorizontal) { // 水平方向合并
            DestImage = new BufferedImage(w1+w2, h1, BufferedImage.TYPE_INT_RGB);
            DestImage.setRGB(0, 0, w1, h1, ImageArrayOne, 0, w1); // 设置上半部分或左半部分的RGB
            DestImage.setRGB(w1, 0, w2, h2, ImageArrayTwo, 0, w2);
        } else { // 垂直方向合并
            DestImage = new BufferedImage(w1, h1 + h2,
                    BufferedImage.TYPE_INT_RGB);
            DestImage.setRGB(0, 0, w1, h1, ImageArrayOne, 0, w1); // 设置上半部分或左半部分的RGB
            DestImage.setRGB(0, h1, w2, h2, ImageArrayTwo, 0, w2); // 设置下半部分的RGB
        }

        return DestImage;
    }

    public static void doMerge(List<String> shots, String dir, String filename) {
        try {
            BufferedImage[] imgs = new BufferedImage[shots.size()];
            for (int i = 0; i < shots.size(); i++) {
                imgs[i] = getBufferedImage(shots.get(i));
            }
            BufferedImage image = ImageUtil.mergeImage(false, imgs);
            ImageUtil.saveImage(image, dir, filename, "png");
        } catch (IOException e) {
            throw new IllegalStateException("failed to merge image", e);
        }
    }
}
