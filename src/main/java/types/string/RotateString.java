package types.string;

public class RotateString {

    public String rotate(String s, int m) {
        m = m % s.length();
        char[] chars = s.toCharArray();
        reverse(chars, 0, m - 1);
        reverse(chars, m, s.length() - 1);
        reverse(chars, 0, s.length() - 1);
        return new String(chars);
    }

    private void reverse(char[] chars, int s, int e) {
        while(s < e) {
            char tmp = chars[s];
            chars[s++] = chars[e];
            chars[e--] = tmp;
        }
    }

}
