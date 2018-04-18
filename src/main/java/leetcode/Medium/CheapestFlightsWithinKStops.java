package leetcode.Medium;

/**
 * https://leetcode.com/problems/cheapest-flights-within-k-stops/description/
 */
public class CheapestFlightsWithinKStops {

//    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
//        Map<Integer, Map<Integer, Integer>> map = new HashMap<>();
//        for (int i = 0; i < flights.length; i++) {
//            int[] flight = flights[i];
//            int u = flight[0];
//            int v = flight[1];
//            int val = flight[2];
//            if(!map.containsKey(u)) {
//                map.put(u, new HashMap<>());
//            }
//            map.get(u).put(v, val);
//        }
//        int[][] dp = new int[n][k + 1];
//        for (int[] row : dp) {
//            Arrays.fill(row, Integer.MAX_VALUE);
//        }
//        for (int i = 1; i <= k ; i++) {
//            for (int j = 0; j < n; j++) {
//                dp[j][i] = dp[j][i - 1];
//            }
//            map.get()
//        }
//    }

}
