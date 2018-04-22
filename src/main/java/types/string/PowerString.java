package types.string;

public class PowerString {

    public String repeat(String text) {
        int[] next = getNext(text);
        int len = text.length();
        int p = len - 1 - next[len - 1];
        if(len % p == 0) {
            return text.substring(0, p);
        }
        return "";
    }

    private int[] getNext(String text) {
        int[] rs = new int[text.length()];
        rs[0] = -1;
        int k = -1;
        int i = 0;
        while(i < text.length() - 1) {
            if(k == -1 || text.charAt(i) == text.charAt(k)) {
                i++;
                k++;
                rs[i] = k;
            }else {
                k = rs[k];
            }
        }
        return rs;
    }

}
