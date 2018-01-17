package leetcode.Medium;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * https://leetcode.com/problems/delete-and-earn/description/
 */
public class DeleteAndEarn {

    private static Map<String, Integer> mem = new HashMap<>();

    public static int deleteAndEarn(int[] nums) {
        if(nums == null || nums.length < 1) {
            return 0;
        }
        Map<Integer, Integer> map = toMap(nums);
        mem.clear();
        return deleteAndEarn(map);
    }

    private static int deleteAndEarn(Map<Integer, Integer> map) {
        if(map.keySet().isEmpty()) {
            return 0;
        }
        String hashValue = hashingMap(map);
        if(mem.containsKey(hashValue)) {
            System.out.println(hashValue + ":" + mem.get(hashValue));
            return mem.get(hashValue);
        }
        int cost = 0;
        for (Integer key : map.keySet()) {
            HashMap<Integer, Integer> subMap = new HashMap<>(map);
            int temp = key + deleteAndEarn(deleteCertainKey(subMap, key));
            if(cost < temp) {
                cost = temp;
            }
        }
        mem.put(hashingMap(map), cost);
        return cost;
    }

    private static Map<Integer, Integer> deleteCertainKey(HashMap<Integer, Integer> subMap, Integer key) {
        if(subMap.get(key) == 1) {
            subMap.remove(key);
        }else {
            subMap.put(key, subMap.get(key) - 1);
        }
        subMap.remove(key + 1);
        subMap.remove(key - 1);
        return subMap;
    }

    private static String hashingMap(Map<Integer, Integer> map) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            sb.append(entry.getKey()).append("-").append(entry.getValue()).append("+");
        }
        return sb.toString();
    }

    private static Map<Integer, Integer> toMap(int[] nums) {
        Map<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < nums.length; i++) {
            putIn(map, nums[i]);
        }
        return map;
    }

    private static void putIn(Map<Integer, Integer> map, int num) {
        if(map.containsKey(num)) {
            map.put(num, map.get(num) + 1);
        }else {
            map.put(num, 1);
        }
    }

}
