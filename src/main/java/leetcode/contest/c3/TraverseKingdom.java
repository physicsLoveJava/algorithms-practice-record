package leetcode.contest.c3;

import java.util.*;

public class TraverseKingdom {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int l = scanner.nextInt();
        boolean[] visited = new boolean[n];
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < n - 1; i++) {
            int v = scanner.nextInt();
            putIn(map, i + 1, v);
            putIn(map, v, i + 1);
        }
        int max = travel(map, 0, l, visited);
        System.out.println(max);
    }

    private static int travel(Map<Integer, List<Integer>> map, int idx, int chance, boolean[] visited) {
        if(chance < 0) {
            return 0;
        }
        visited[idx] = true;
        List<Integer> list = map.get(idx);
        int max = 1;
        for (Integer target : list) {
            if(!visited[target]) {
                int tmp = travel(map, target, chance - 1, visited) + 1;
                if(tmp > max) {
                    max = tmp;
                }
            }else {
                int tmp = travel(map, target, chance - 1, visited);
                if(tmp > max) {
                    max = tmp;
                }
            }
        }
        return max;
    }

    private static void putIn(Map<Integer, List<Integer>> map, int v1, int v2) {
        if(!map.containsKey(v1)) {
            map.put(v1, new ArrayList<>());
        }
        List<Integer> list = map.get(v1);
        list.add(v2);
        map.put(v1, list);
    }

}
