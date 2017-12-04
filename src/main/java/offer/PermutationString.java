package offer;

import org.apache.commons.lang3.ArrayUtils;

public class PermutationString {

    public static void permutate(String str) {
        if(str == null) {
            return;
        }
        permutate(str.toCharArray(), 0);
    }

    private static void permutate(char[] str, int begin) {
        if(str.length - 1 == begin) {
            System.out.println(new String(str));
            return;
        }
        for (int i = begin; i < str.length; i++) {
            ArrayUtils.swap(str, i, begin);
            permutate(str, begin + 1);
            ArrayUtils.swap(str, i, begin);
        }
    }

}
