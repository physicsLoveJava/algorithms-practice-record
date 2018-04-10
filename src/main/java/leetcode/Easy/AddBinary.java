package leetcode.Easy;

/**
 * Problem Url: https://leetcode.com/problems/add-binary
 */
public class AddBinary {

    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        while(i >= 0 && j >= 0) {
            int v1 = a.charAt(i--) - '0';
            int v2 = b.charAt(j--) - '0';
            int rs = v1 + v2 + carry;
            if(rs > 1) {
                carry = 1;
                rs -= 2;
            }else {
                carry = 0;
            }
            sb.append(rs);
        }
        while(i >= 0) {
            int v1 = a.charAt(i--) - '0';
            int rs = v1 + carry;
            if(rs > 1) {
                carry = 1;
                rs -= 2;
            }else {
                carry = 0;
            }
            sb.append(rs);
        }
        while(j >= 0) {
            int v1 = b.charAt(j--) - '0';
            int rs = v1 + carry;
            if(rs > 1) {
                carry = 1;
                rs -= 2;
            }else {
                carry = 0;
            }
            sb.append(rs);
        }
        if(carry != 0) {
            sb.append(carry);
        }
        String s = sb.toString();
        return reverse(s);
    }

    private String reverse(String s) {
        int i = 0, j = s.length() - 1;
        char[] chars = s.toCharArray();
        while(i < j) {
            char tmp = chars[i];
            chars[i] = chars[j];
            chars[j] = tmp;
            i++;
            j--;
        }
        return new String(chars);
    }

}
