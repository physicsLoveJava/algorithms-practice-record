package company.microsoft.c3;

import java.util.*;

public class MostFrequentLogs {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        while (scanner.hasNext()) {
            String s = scanner.nextLine();
            list.add(s);
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            for (int j = 1; j < list.size(); j++) {
                if(isEditDist(list.get(i), list.get(j))) {
                    map.put(i, j);
                }
            }
        }
        int max = 0;
        for (Integer val : map.values()) {
            if(max < val) {
                max = val;
            }
        }
        System.out.println(max);
    }

    private static boolean isEditDist(String s, String t) {
        int m = s.length() + 1;
        int n = t.length() + 1;
        int[][] dp = new int[m][n];
        return compute(dp, s, s.length(), t, t.length()) <= 5;
    }

    private static int compute(int[][] dp, String s, int m, String t, int n) {
        if(m < 0) {
            return n;
        }
        if(n < 0) {
            return m;
        }
        if(dp[m][n] != 0) {
            return dp[m][n];
        }
        int val = 0;
        if(s.charAt(m) == t.charAt(n)) {
            val = compute(dp, s, m - 1, t, n - 1);
        }else {
            val = Math.min(
                    compute(dp, s, m - 1, t, n),
                    compute(dp, s, m, t, n - 1)
            ) + 1;
        }
        return dp[m][n] = val;
    }

}
