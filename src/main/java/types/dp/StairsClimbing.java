package types.dp;

public class StairsClimbing {

    private static int[] table;

    public static int climb(int n) {
        if(n < 0) {
            return 0;
        }
        table = new int[n];
        return climbStair(n - 1);
    }

    private static int climbStair(int n) {
        if(n == 0 || n == 1) {
            return 1;
        }
        if(table[n] != 0) {
            return table[n];
        }
        return table[n] = climbStair(n - 1) + climbStair(n - 2);
    }

    public static int climbUp(int n) {
        if(n < 0) {
            return 0;
        }
        table = new int[n];
        return climbStairUp(n - 1);
    }

    private static int climbStairUp(int n) {
        if(n == 0 || n == 1) {
            return 1;
        }
        if(table[n] != 0) {
            return table[n];
        }
        table[0] = table[1] = 1;
        for (int i = 2; i <= n; i++) {
            table[i] = table[i - 1] + table[i - 2];
        }
        return table[n];
    }

}
