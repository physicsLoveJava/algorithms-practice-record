package leetcode.Medium;

import java.util.*;

/**
 * Problem Url: https://leetcode.com/problems/combination-sum-iv
 */
public class CombinationSumIvSp1 {

    static Map<Integer, Integer> map;

    public int combinationSum4(int[] nums, int target) {
        map = new HashMap<>();
        return compute(nums, target);
    }

    private int compute(int[] nums, int target) {
        if(target == 0) {
            return 1;
        }
        int tCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if(target - nums[i] >= 0) {
                if(map.containsKey(target - nums[i])) {
                    int count = map.get(target - nums[i]);
                    tCount += count;
                }else {
                    tCount += compute(nums, target - nums[i]);
                }
            }
        }
        map.put(target, tCount);
        return tCount;
    }

}
