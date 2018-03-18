package leetcode.Easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Problem Url: https://leetcode.com/problems/single-number
 */
public class SingleNumber {

    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if(!map.containsKey(num)) {
                map.put(num, 0);
            }
            map.put(num, map.get(num) + 1);
        }
        for (Integer key : map.keySet()) {
            if (map.get(key) == 1) {
                return key;
            }
        }
        return -1;
    }

}
