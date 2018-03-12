package leetcode.ex;

/**
 * Problem Url: https://leetcode.com/problems/find-the-duplicate-number
 */
public class FindTheDuplicateNumberSp1 {

    public int findDuplicate(int[] nums) {
        int fast = 0;
        int slow = 0;
        do {
            fast = nums[nums[fast]];
            slow = nums[slow];
        } while (fast != slow);
        int find = 0;
        while(find != slow) {
            find = nums[find];
            slow = nums[slow];
        }
        return find;
    }

}
