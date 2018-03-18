package leetcode.Easy;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Problem Url: https://leetcode.com/problems/jewels-and-stones
 */
public class JewelsAndStones {

    public int numJewelsInStones(String J, String S) {
        char[] chars = J.toCharArray();
        HashSet<Object> set = new HashSet<>(chars.length);
        for (char aChar : chars) {
            set.add(aChar);
        }
        char[] targets = S.toCharArray();
        int count = 0;
        for (char target : targets) {
            if(set.contains(target)) {
                count++;
            }
        }
        return count;
    }

}
