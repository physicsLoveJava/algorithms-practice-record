package types.string;

import java.util.Arrays;

public class PowerString {

    public String repeat(String text) {
        int[] next = getNext(text);
        System.out.println(Arrays.toString(next));
        int p = next[text.length() - 1];
        if(text.length() % p == 0) {
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
                if(text.charAt(k) == text.charAt(i)) {
                    rs[i] = rs[k];
                }else {
                    rs[i] = k;
                }
            }else {
                k = rs[k];
            }
        }
        return rs;
    }

}
