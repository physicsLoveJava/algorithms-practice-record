package leetcode.Medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Problem Url: https://leetcode.com/problems/find-all-duplicates-in-an-array
 */
public class FindAllDuplicatesInAnArray {

    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int idx = Math.abs(nums[i]) - 1;
            if(nums[idx] < 0) {
                resultList.add(idx + 1);
            }
            nums[idx] = -nums[idx];
        }
        return resultList;
    }

}
