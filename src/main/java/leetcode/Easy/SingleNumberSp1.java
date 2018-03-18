package leetcode.Easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Problem Url: https://leetcode.com/problems/single-number
 */
public class SingleNumberSp1 {

    public int singleNumber(int[] nums) {
        int n = 0;
        for (int num : nums) {
            n ^= num;
        }
        return n;
    }

}
