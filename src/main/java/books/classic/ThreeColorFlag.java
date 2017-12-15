package books.classic;

import org.apache.commons.lang3.ArrayUtils;

public class ThreeColorFlag {

    //Blue White Red
    public static String move(String str) {
        if(str == null) {
            return null;
        }
        char[] chars = str.toCharArray();
        int blue = 0, white = 0, red = chars.length - 1;
        while(white <= red) {
            System.out.println(chars);
            if(isBlue(chars[white])) {
                if(blue == white) {
                    blue ++;white++;
                }else {
                    ArrayUtils.swap(chars, blue++, white++);
                }
            }else if(isRed(chars[white])) {
                while(white <= red && isRed(chars[red])) {
                    red--;
                }
                ArrayUtils.swap(chars, red--, white);
            }else {
                white++;
            }
        }

        return new String(chars);
    }

    private static boolean isBlue(char aChar) {
        return aChar == 'B';
    }

    private static boolean isWhite(char aChar) {
        return aChar == 'W';
    }

    private static boolean isRed(char aChar) {
        return aChar == 'R';
    }

}
