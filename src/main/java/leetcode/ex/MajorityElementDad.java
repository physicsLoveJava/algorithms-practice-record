package leetcode.ex;

public class MajorityElementDad {

    public static int find(int[] nums) {
        if(nums == null || nums.length == 0) {
            throw new RuntimeException();
        }
        return major(nums, 0, nums.length - 1);
    }

    private static int major(int[] nums, int start, int end) {
        if(start == end) {
            return nums[start];
        }

        int middle = (start + end) / 2;

        int left = major(nums, start, middle);
        int right = major(nums, middle + 1, end);

        if(left == right) {
            return left;
        }

        int leftCount = countInRange(nums, left, start, end);
        int rightCount = countInRange(nums, right, start, end);

        return leftCount > rightCount ? left : right;
    }

    private static int countInRange(int[] nums, int num, int start, int end) {
        int count = 0;
        for (int i = start; i <= end ; i++) {
            if(nums[i] == num) {
                count++;
            }
        }
        return count;
    }

}
