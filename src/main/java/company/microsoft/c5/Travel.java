package company.microsoft.c5;

import java.util.*;

public class Travel {

    static int seq = 0;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int r = scanner.nextInt();
            Map<Integer, List<Integer>> map = new HashMap<>();
            for (int j = 0; j < r - 1; j++) {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                putIn(map, a, b);
                putIn(map, b, a);
            }
            int m = scanner.nextInt();
            List<Integer> order = new ArrayList<>();
            for (int j = 0; j < m; j++) {
                order.add(scanner.nextInt());
            }
            System.out.println(isPossible(map, order, r, 1));
        }
    }

    private static boolean isPossible(Map<Integer, List<Integer>> map, List<Integer> order, int r, int idx) {
        boolean[] visited = new boolean[r + 1];
        seq = 0;
        return dfs(map, visited, order, new HashMap<>(), idx);
    }

    private static boolean dfs(Map<Integer, List<Integer>> map, boolean[] visited,
                               List<Integer> order, HashMap<Integer, Integer> route, int idx) {
        if(visited[idx]) {
            return true;
        }
        visited[idx] = true;
        route.put(idx, seq++);
        if(!isCorrectOrder(route, order)) {
            visited[idx] = false;
            return false;
        }
        List<Integer> walkList = map.get(idx);
        if(walkList.isEmpty()) {
            return true;
        }else {
            for (Integer walk : walkList) {
                boolean ok = dfs(map, visited, order, route, walk);
                if(!ok) {
                    visited[idx] = false;
                    return false;
                }
            }
        }
        visited[idx] = false;
        return true;
    }

    private static boolean isCorrectOrder(HashMap<Integer, Integer> route, List<Integer> order) {
        int last = -1;
        for (Integer r : order) {
            Integer val = route.get(r);
            if(val != null) {
                if (val < last) {
                    return false;
                } else {
                    last = val;
                }
            }
        }
        return true;
    }

    private static void putIn(Map<Integer, List<Integer>> map, int k, int v) {
        if(!map.containsKey(k)) {
            map.put(k, new ArrayList<>());
        }
        List<Integer> list = map.get(k);
        list.add(v);
        map.put(k, list);
    }

}
