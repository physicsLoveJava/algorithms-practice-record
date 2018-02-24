package leetcode.Easy;

/**
 * Problem Url: https://leetcode.com/problems/two-sum-ii-input-array-is-sorted
 */
public class TwoSumIiInputArrayIsSorted {

    public int[] twoSum(int[] numbers, int target) {
        if(numbers == null || numbers.length < 2) {
            throw new IllegalArgumentException();
        }
        for (int i = 0; i < numbers.length; i++) {
            int idx = search(numbers, i + 1, target - numbers[i]);
            if(idx != -1) {
                return new int[] {i + 1, idx + 1};
            }
        }
        return new int[] {-1, -1};
    }

    private int search(int[] numbers, int start, int val) {
        int end = numbers.length - 1;
        int mid = (start + end) / 2;
        while(start <= end) {
            if(val == numbers[mid]) {
                return mid;
            }else if(val > numbers[mid]) {
                start = mid + 1;
            }else {
                end = mid - 1;
            }
            mid = (start + end) / 2;
        }
        return -1;
    }

}
