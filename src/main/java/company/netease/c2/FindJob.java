package company.netease.c2;

import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.TreeMap;

public class FindJob {

    static class Info implements Comparable<Info> {
        int rank;
        int salary;

        @Override
        public int compareTo(Info o) {
            return rank - o.rank;
        }

        @Override
        public String toString() {
            return "Info{" +
                    "rank=" + rank +
                    ", salary=" + salary +
                    '}';
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        PriorityQueue<Info> queue = new PriorityQueue<>();
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            Info info = new Info();
            info.rank = scanner.nextInt();
            info.salary = scanner.nextInt();
            queue.add(info);
        }

        int curMax = 0;
        while(!queue.isEmpty()) {
            Info info = queue.poll();
            if(info.salary > curMax) {
                curMax = info.salary;
            }
            info.salary = curMax;
            map.put(info.rank, info.salary);
        }

        for (int i = 0; i < m; i++) {
            int p = scanner.nextInt();
            Map.Entry<Integer, Integer> entry = map.floorEntry(p);
            if(entry == null) {
                System.out.println(0);
            }else {
                System.out.println(entry.getValue());
            }
        }

    }

}
