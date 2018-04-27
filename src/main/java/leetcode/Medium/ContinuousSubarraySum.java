package leetcode.Medium;

/**
 * Problem Url: https://leetcode.com/problems/continuous-subarray-sum
 */
public class ContinuousSubarraySum {

    public boolean checkSubarraySum(int[] nums, int k) {
        int[] prefix = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                prefix[i] = nums[i];
            }else {
                prefix[i] = prefix[i - 1] + nums[i];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int sum;
                if(i != 0) {
                    sum = prefix[j] - prefix[i - 1];
                }else {
                    sum = prefix[j];
                }
                //k == 0 --> sum == 0
                //k != 0 --> sum % k == 0
                //sum == 0 --> 0 * k
                if(sum == 0) {
                    return true;
                }
                else {
                    if(k != 0 && sum % k == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

}
