package leetcode.Medium;

/**
 * Problem Url: https://leetcode.com/problems/matchsticks-to-square
 */
public class MatchsticksToSquare {

    public boolean makesquare(int[] nums) {
        if(nums.length < 4) {
            return false;
        }
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        if(sum != 0 && sum % 4 != 0) {
            return false;
        }
        int[] edges = new int[4];
        return dfs(nums, edges, 0, sum / 4);
    }

    private boolean dfs(int[] nums, int[] edges, int idx, int target) {
        if(idx == nums.length) {
            for (int i = 0; i < edges.length; i++) {
                if (edges[i] != target) {
                    return false;
                }
            }
            return true;
        }
        for (int i = 0; i < edges.length; i++) {
            if(edges[i] + nums[idx] <= target) {
                edges[i] += nums[idx];
                if(dfs(nums, edges, idx + 1, target)) {
                    return true;
                }
                edges[i] -= nums[idx];
            }
        }
        return false;
    }

}
