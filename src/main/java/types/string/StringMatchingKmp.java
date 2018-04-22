package types.string;

public class StringMatchingKmp {

    public int match(String text, String pattern) {
        if(text == null || pattern == null) {
            return -1;
        }
        int j = 0;
        int[] next = getNext(pattern);
        int i = 0;
        while(i <= text.length() - 1) {
            if(j == -1 || text.charAt(i) == pattern.charAt(j)) {
                j++;
                i++;
            }else {
                j = next[j];
            }
            if(j == pattern.length()) {
                return i - pattern.length();
            }
        }
        return -1;
    }

    private int[] getNext(String pattern) {
        int[] rs = new int[pattern.length()];
        rs[0] = -1;
        int k = -1;
        int i = 1;
        while(i < pattern.length() - 1) {
            if(k == -1 || pattern.charAt(k) == pattern.charAt(i)) {
                rs[i + 1] = k + 1;
                k++;
                i++;
            }else {
                k = rs[k];
            }
        }
        return rs;
    }

}
