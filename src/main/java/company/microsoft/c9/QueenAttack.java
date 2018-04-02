package company.microsoft.c9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class QueenAttack {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Map<Long, Long> xmap = new HashMap<>();
        Map<Long, Long> ymap = new HashMap<>();
        Map<Long, Long> amap = new HashMap<>();
        Map<Long, Long> bmap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            long[] pos = new long[] {
                    scanner.nextLong(),
                    scanner.nextLong()
            };
            putIn(xmap, pos[0]);
            putIn(ymap, pos[1]);
            putIn(amap, pos[1] + pos[0]);
            putIn(bmap, pos[1] - pos[0]);
        }
        long count = 0;
        for (Long val : xmap.values()) {
            count += comb(val);
        }
        for (Long val : ymap.values()) {
            count += comb(val);
        }
        for (Long val : amap.values()) {
            count += comb(val);
        }
        for (Long val : bmap.values()) {
            count += comb(val);
        }
        System.out.println(count);
    }

    private static long comb(long size) {
        return size * (size - 1) / 2;
    }

    public static void putIn(Map<Long, Long> map, long key) {
        if(!map.containsKey(key)) {
            map.put(key, (long) 0);
        }
        map.put(key, map.get(key) + 1);
    }

}
