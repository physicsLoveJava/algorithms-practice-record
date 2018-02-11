package leetcode.ex;

public class MaximumSubArrayDad {

    public static int find(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        return maximum(nums, 0, nums.length - 1);
    }

    private static int maximum(int[] nums, int start, int end) {
        if(start == end) {
            return nums[start];
        }
        int middle = (start + end) / 2;
        int left = maximum(nums, start, middle);
        int right = maximum(nums, middle + 1, end);
        // maximum value is from left, right, or in the middle
        int midLeft = nums[middle];
        int midRight = nums[middle + 1];
        int temp = 0;
        for (int i = middle; i >= start ; i--) {
            temp += nums[i];
            if(temp > midLeft) {
                midLeft = temp;
            }
        }
        temp = 0;
        for (int i = middle + 1; i <= end; i++) {
            temp += nums[i];
            if(temp > midRight) {
                midRight = temp;
            }
        }
        return Math.max(
                Math.max(left, right),
                midLeft +midRight
        );
    }

}
