package leetcode.Medium;

import java.util.Stack;

/**
 * Problem Url: https://leetcode.com/problems/beautiful-arrangement-ii
 */
public class BeautifulArrangementIi {

    public int[] constructArray(int n, int k) {
        int[] ans = new int[n];
        int c = 0;
        for (int v = 1; v < n-k; v++) {
            ans[c++] = v;
        }
        for (int i = 0; i <= k; i++) {
            ans[c++] = (i%2 == 0) ? (n-k + i/2) : (n - i/2);
        }
        return ans;
    }

}
