package leetcode.Easy;

import java.util.Arrays;

/**
 * Problem Url: https://leetcode.com/problems/plus-one
 */
public class PlusOne {

    public int[] plusOne(int[] digits) {
        if(digits == null || digits.length == 0) {
            return new int[0];
        }
        int[] tmp = new int[digits.length + 1];
        System.arraycopy(digits, 0, tmp, 1, digits.length);
        int ext = 1;
        for (int i = tmp.length - 1; i >= 1; i--) {
            tmp[i] += ext;
            if(tmp[i] > 9) {
                ext = 1;
                tmp[i] = 10 - tmp[i];
            }else {
                ext = 0;
            }
        }
        if(ext == 0) {
            return Arrays.copyOfRange(tmp, 1, tmp.length);
        }else {
            tmp[0] = 1;
            return tmp;
        }
    }

}
