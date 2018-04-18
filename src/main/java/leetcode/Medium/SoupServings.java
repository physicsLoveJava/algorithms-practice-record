package leetcode.Medium;

/**
 * https://leetcode.com/problems/soup-servings/description/
 */
public class SoupServings {

    public double soupServings(int n) {
        int t = (int) Math.ceil(n / (double)25);
        if(t > 500) {
            return 1.0;
        }
        double[][] dp = new double[t + 1][t + 1];
        compute(dp, t, t);
        return dp[t][t];
    }

    private double compute(double[][] dp, int a, int b) {
        a = Math.max(0, a);
        b = Math.max(0, b);
        if(dp[a][b] != 0) {
            return dp[a][b];
        }
        if(a == 0) {
            dp[0][b] = 1;
        }
        if(a == 0 && b == 0) {
            dp[a][0] = 0.5;
        }
        if(a > 0 && b > 0) {
            dp[a][b] = 0.25 * (
                    compute(dp, a - 4, b) + compute(dp, a - 3, b - 1)
                            + compute(dp, a - 2, b - 2) + compute(dp, a - 1, b - 3)
            );
        }
        return dp[a][b];
    }

}
