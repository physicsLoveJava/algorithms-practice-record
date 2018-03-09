package leetcode.Easy;

import java.util.*;

/**
 * Problem Url: https://leetcode.com/problems/contains-duplicate-ii
 */
public class ContainsDuplicateIi {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(!map.containsKey(nums[i])) {
                map.put(nums[i], new ArrayList<>());
            }
            List<Integer> list = map.get(nums[i]);
            list.add(i);
            map.put(nums[i], list);
        }
        for (Integer key : map.keySet()) {
            if (map.get(key).size() < 2) {
                continue;
            }
            List<Integer> list = map.get(key);
            Collections.sort(list);
            for (int i = 1; i < list.size(); i++) {
                if(list.get(i) - list.get(i - 1) <= k) {
                    return true;
                }
            }
        }
        return false;
    }

}
