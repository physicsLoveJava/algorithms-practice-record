package leetcode.ex;

import java.util.*;

/**
 * Problem Url: https://leetcode.com/problems/contains-duplicate-ii
 */
public class ContainsDuplicateIiSp1 {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++){
            if(i > k) set.remove(nums[i-k-1]);
            if(!set.add(nums[i])) return true;
        }
        return false;
    }

}
