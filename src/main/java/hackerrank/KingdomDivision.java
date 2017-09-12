package hackerrank;

import java.util.*;

/**
 * problem url: https://www.hackerrank.com/challenges/kingdom-division/problem
 */
public class KingdomDivision {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<Integer, List<Integer>> roadMap = new HashMap<Integer, List<Integer>>();
        for (int i = 0; i < n - 1; i++) {
            int u = in.nextInt();
            int v = in.nextInt();
            putEdge(roadMap, u, v);
            putEdge(roadMap, v, u);
        }
        System.out.println(roadMap);
    }

    private static void putEdge(Map<Integer, List<Integer>> roadMap, int u, int v) {
        if(roadMap.containsKey(u)) {
            roadMap.get(u).add(v);
        }else {
            List<Integer> list = new ArrayList<Integer>();
            list.add(v);
            roadMap.put(u, list);
        }
    }

}
