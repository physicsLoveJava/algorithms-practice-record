package leetcode.Easy;

/**
 * Problem Url: https://leetcode.com/problems/search-insert-position
 */
public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {

        if(nums == null) {
            throw new IllegalArgumentException();
        }

        if(nums.length == 0) {
            return 0;
        }

        boolean isFound = false;
        int idx = -1;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] < target) {
                continue;
            }else if(nums[i] == target) {
                isFound = true;
                idx = i;
            }else {
                if(!isFound) {
                    isFound = true;
                    idx = i;
                }
            }
        }
        if(!isFound) {
            idx = nums.length;
        }
        return idx;
    }

}
