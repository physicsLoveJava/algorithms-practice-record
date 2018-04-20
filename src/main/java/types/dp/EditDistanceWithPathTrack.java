package types.dp;

/**
 * match --> dp(i, j) --> dp(i - 1, j - 1);
 * insert --> dp(i, j) --> dp(i, j - 1) + insertCost;
 * delete --> dp(i, j) --> dp(i - 1, j) + deletionCost;
 * replace --> dp(i, j) --> dp(i - 1, j - 1) + replaceCost;
 *
 * find the minimum cost
 */
public class EditDistanceWithPathTrack {

    class Track {
        int cost;
        int parent;
    }

    enum Type {
        MATCH,
        REPLACE,
        INSERT,
        DELETE
    }

    public int editDistance(String s, String t) {
        int m = s.length();
        int n = t.length();
        Track[][] dp = new Track[m + 1][n + 1];
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                dp[i][j] = new Track();
            }
        }
        for (int i = 0; i <= m; i++) {
            dp[i][0].cost = i;
            if(i == 0) {
                dp[i][0].parent = -1;
            }else {
                dp[i][0].parent = Type.DELETE.ordinal();
            }
        }
        for (int i = 0; i <= n; i++) {
            dp[0][i].cost = i;
            if(i == 0) {
                dp[0][i].parent = -1;
            }else {
                dp[0][i].parent = Type.INSERT.ordinal();
            }
        }
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if(s.charAt(i - 1) == t.charAt(j - 1)) {
                    dp[i][j].cost = dp[i - 1][j - 1].cost;
                    dp[i][j].parent = Type.MATCH.ordinal();
                }else {
//                    dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + 1;//without replace
                    int min = Math.min(
                            Math.min(dp[i - 1][j - 1].cost, dp[i - 1][j].cost),
                            dp[i][j - 1].cost);
                    dp[i][j].cost = min + 1;
                    if(min == dp[i - 1][j - 1].cost) {
                        dp[i][j].parent = Type.REPLACE.ordinal();
                    }else if(min == dp[i - 1][j].cost) {
                        dp[i][j].parent = Type.DELETE.ordinal();
                    }else {
                        dp[i][j].parent = Type.INSERT.ordinal();
                    }
                }
            }
        }
        pathTrack(dp, s, t, m, n);
        System.out.println();
        return dp[m][n].cost;
    }

    private void pathTrack(Track[][] dp, String s, String t, int m, int n) {
        int parent = dp[m][n].parent;
        if(parent == -1) {
            return;
        }
        if(parent == Type.MATCH.ordinal()) {
            pathTrack(dp, s, t, m - 1, n - 1);
            return;
        }
        if(parent == Type.REPLACE.ordinal()) {
            pathTrack(dp, s, t, m - 1, n - 1);
            System.out.printf("R(%s -> %s)", s.charAt(m - 1), t.charAt(n - 1));
            return;
        }
        if(parent == Type.DELETE.ordinal()) {
            pathTrack(dp, s, t, m - 1, n);
            System.out.printf("D(%s)", s.charAt(m - 1));
            return;
        }
        if(parent == Type.INSERT.ordinal()) {
            pathTrack(dp, s, t, m, n - 1);
            System.out.printf("I(%s)", t.charAt(n - 1));
            return;
        }
    }

}
