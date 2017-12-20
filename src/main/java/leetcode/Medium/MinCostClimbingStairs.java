package leetcode.Medium;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/min-cost-climbing-stairs/description/
 */
public class MinCostClimbingStairs {

    private static int[] arr0;
    private static int[] arr1;

    public int minCostClimbingStairsBetter(int[] cost) {
        int f1 = 0, f2 = 0;
        for (int i = cost.length - 1; i >= 0; --i) {
            int f0 = cost[i] + Math.min(f1, f2);
            f2 = f1;
            f1 = f0;
        }
        return Math.min(f1, f2);
    }

    public static int minCostClimbingStairs(int[] cost) {
        if(cost == null) {
            return 0;
        }
        arr0 = new int[cost.length];
        arr1 = new int[cost.length];
        int result = Math.min(from0(cost), from1(cost));
        System.out.println(Arrays.toString(cost));
        System.out.println(Arrays.toString(arr0));
        System.out.println(Arrays.toString(arr1));
        System.out.println();
        return result;
    }

    private static int from1(int[] cost) {
        if(cost.length < 2) {
            return cost[0];
        }
        if(cost.length == 2) {
            return cost[1];
        }
        arr1[0] = cost[0];
        arr1[1] = cost[1];
        arr1[2] = cost[1];
        for (int i = 3; i < cost.length; i++) {
            arr1[i] = Math.min(arr1[i - 1] + cost[i], arr1[i - 2] + cost[i - 1]);
        }
        return arr1[cost.length - 1];
    }

    private static int from0(int[] cost) {
        if(cost.length <= 2) {
            return cost[0];
        }
        arr0[0] = arr0[1] = cost[0];
        for (int i = 2; i < cost.length; i++) {
            arr0[i] = Math.min(arr0[i - 1] + cost[i], arr0[i - 2] + cost[i - 1]);
        }
        return arr0[cost.length - 1];
    }

}
