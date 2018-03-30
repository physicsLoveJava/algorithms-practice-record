package leetcode.Medium;

/**
 * Problem Url: https://leetcode.com/problems/friend-circles
 */
public class FriendCircles {

    public int findCircleNum(int[][] m) {
        if(m == null || m.length == 0) {
            return 0;
        }
        int[] arr = new int[m.length];
        int count = 0;
        for (int i = 0; i < m.length; i++) {
            if(arr[i] == 0) {
                arr[i] = 1;
                dfs(m, arr, i);
                count++;
            }
        }
        return count;
    }

    private void dfs(int[][] m, int[] arr, int i) {
        for (int j = 0; j < m.length; j++) {
            if(m[i][j] == 1 && arr[j] == 0) {
                arr[j] = 1;
                dfs(m, arr, j);
            }
        }
    }


}
