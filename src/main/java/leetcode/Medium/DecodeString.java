package leetcode.Medium;

/**
 * Problem Url: https://leetcode.com/problems/decode-string
 */
public class DecodeString {

    public String decodeString(String s) {
        if(s == null || s.length() == 0) {
            return "";
        }
        return decodeString(s, 0, s.length() - 1);
    }

    private String decodeString(String str, int s, int e) {
        if(s > e) {
            return "";
        }
//        System.out.println("str = [" + str + "], s = [" + s + "], e = [" + e + "]");
        int left = s, right = e;
        StringBuilder sb = new StringBuilder();
        while(left <= right) {
            s = left;
            while(left <= right && Character.isLetter(str.charAt(left))) {
                left ++;
            }
            sb.append(str, s, left);
            s = left;
            while(left <= right && Character.isDigit(str.charAt(left))) {
                left ++;
            }
            if(left > right) {
                break;
            }
            if(s == left) {
                left ++;
                continue;
            }
            int k = Integer.parseInt(str.substring(s, left));
            int count = 0;
            int ns = left + 1;
            while(left <= right) {
                if(str.charAt(left) == '[') {
                    count ++;
                }else if(str.charAt(left) == ']') {
                    count --;
                }
                left++;
                if(count == 0) {
                    break;
                }
            }
            String repeat = decodeString(str, ns, left - 1);
            for (int i = 0; i < k; i++) {
                sb.append(repeat);
            }
        }
        return sb.toString();
    }

}
