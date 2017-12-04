package offer;

import org.apache.commons.lang3.ArrayUtils;

import java.util.HashSet;

//TODO
public class CombinationString {

    private static HashSet<String> set;

    public static void combine(String str, int k) {
        if(str == null) {
            return;
        }
        set = new HashSet<>();
        combinex(str.toCharArray(), "",  0,  k);
    }

    private static void combinex(char[] chars, String val, int idx, int k) {
//        System.out.println("val = [" + val + "], idx = [" + idx + "], k = [" + k + "]");
        if(k < 0 || idx > chars.length - 1) {
            System.out.println(val);
            return;
        }
        combinex(chars, val, idx + 1, k);
        combinex(chars, val + chars[idx], idx + 1, k - 1);
    }

    public static void combine(String str) {
        if(str == null) {
            return;
        }
        set = new HashSet<>();
        combine(str.toCharArray(), 0);
    }

    private static void combine(char[] str, int begin) {
        if(str.length - 1 == begin) {
            String cac = new String(str);
            if(!set.contains(cac)) {
                System.out.println(cac);
                set.add(cac);
            }
            return;
        }
        for (int i = begin; i < str.length; i++) {
            ArrayUtils.swap(str, i, begin);
            combine(str, begin + 1);
            ArrayUtils.swap(str, i, begin);
        }
    }

}
