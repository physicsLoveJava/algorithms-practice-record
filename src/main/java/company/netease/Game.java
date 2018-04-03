package company.netease;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, Integer> bucketMap = new HashMap<>();
        while(scanner.hasNext()) {
            int k = scanner.nextInt();
            if(!bucketMap.containsKey(k)) {
                bucketMap.put(k, 0);
            }
            bucketMap.put(k, bucketMap.get(k) + 1);
        }
        System.out.println(computeMax(bucketMap));
    }

    private static int computeMax(Map<Integer, Integer> bucketMap) {
        int pick = 0, unpick = 0, prev = -1;
        for (Integer key : bucketMap.keySet()) {
            int curMax = Math.max(pick, unpick);
            if(key - 1 != prev) {
                pick = key * bucketMap.get(key) + curMax;
                unpick = curMax;
            }else {
                pick = key * bucketMap.get(key) + unpick;
                unpick = curMax;
            }
            prev = key;
        }
        return Math.max(pick, unpick);
    }

    static class Test1 {
        public static void main(String[] args) {
            HashMap<Integer, Integer> map = new HashMap<>();
            map.put(2, 1);
            map.put(3, 3);
            map.put(4, 1);
            System.out.println(computeMax(map));
        }
    }

}
