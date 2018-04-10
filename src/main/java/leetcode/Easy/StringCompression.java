package leetcode.Easy;

/**
 * Problem Url: https://leetcode.com/problems/string-compression
 */
public class StringCompression {

    public int compress(char[] chars) {
        int anchor = 0, write = 0;
        for (int read = 0; read < chars.length; read++) {
            if(read == chars.length - 1 || chars[read + 1] != chars[read]) {
                chars[write++] = chars[anchor];
                if(read > anchor) {
                    for (char x : (read - anchor + 1 + "").toCharArray()) {
                        chars[write++] = x;
                    }
                }
                anchor = read + 1;
            }
        }
        return write;
    }

}
