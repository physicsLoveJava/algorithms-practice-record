package types.divide;

import java.io.File;

/**
 * simple recursive directory display
 */
public class DisplayDirectory {

    public static void display(String path) {
        File file = new File(path);
        if(file.isFile()) {
            print(file);
        }else if(file.isDirectory()) {
            File[] files = file.listFiles();
            for (int i = 0; i < files.length; i++) {
                display(files[i].getAbsolutePath());
            }
        }
    }

    private static void print(File file) {
        System.out.println(file.getAbsolutePath());
    }

}
