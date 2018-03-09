package leetcode.Easy;

/**
 * Problem Url: https://leetcode.com/problems/reshape-the-matrix
 */
public class ReshapeTheMatrix {

    public int[][] matrixReshape(int[][] nums, int r, int c) {
        if(nums.length * nums[0].length != r * c) {
            return nums;
        }
        int[] arr = new int[nums.length * nums[0].length];
        int z = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                arr[z++] = nums[i][j];
            }
        }
        int[][] reshape = new int[r][c];
        z = 0;
        for (int i = 0; i < reshape.length; i++) {
            for (int j = 0; j < reshape[0].length; j++) {
                reshape[i][j] = arr[z++];
            }
        }
        return reshape;
    }

}
