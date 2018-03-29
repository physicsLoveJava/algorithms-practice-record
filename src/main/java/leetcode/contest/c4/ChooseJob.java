package leetcode.contest.c4;

import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.TreeMap;

public class ChooseJob {

    static class Pair implements Comparable<Pair>{
        int key;
        int val;

        public Pair(int key, int val) {
            this.key = key;
            this.val = val;
        }

        @Override
        public int compareTo(Pair o) {
            return key - o.key;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        TreeMap<Integer, Integer> map = new TreeMap<>();
        PriorityQueue<Pair> queue = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            queue.add(new Pair(scanner.nextInt(), scanner.nextInt()));
        }
        Pair[] objects = queue.toArray(new Pair[0]);
        for (int i = 0; i < n; i++) {
            int key = objects[i].key;
            int value = objects[i].val;
            Map.Entry<Integer, Integer> entry = map.floorEntry(key);
            if(entry == null) {
                map.put(key, value);
            }else if(entry.getValue() < value) {
                map.put(key, value);
            }
        }
        for (int i = 0; i < m; i++) {
            int p = scanner.nextInt();
            Map.Entry<Integer, Integer> entry = map.floorEntry(p);
            System.out.println(entry.getValue());
        }
    }

}
