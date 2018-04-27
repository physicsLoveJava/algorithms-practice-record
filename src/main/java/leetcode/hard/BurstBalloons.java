package leetcode.hard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Problem Url: https://leetcode.com/problems/burst-balloons
 */
public class BurstBalloons {

    /**
     * using the map memo state is tle
     * @param nums
     * @return
     */
    public int maxCoins(int[] nums) {
        Map<String, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }
        return compute(map, list);
    }

    private int compute(Map<String, Integer> map, List<Integer> list) {
        if(list.isEmpty()) {
            return 0;
        }
        String hash = list.toString();
        if(map.containsKey(hash)) {
            return map.get(hash);
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            List<Integer> subList = new ArrayList<>(list);
            subList.remove(i);
            int tmp = getVal(list, i) + compute(map, subList);
            max = Math.max(max, tmp);
        }
        map.put(hash, max);
        return max;
    }

    private int getVal(List<Integer> list, int idx) {
        return getValIfPresent(list, idx - 1)
                * getValIfPresent(list, idx)
                * getValIfPresent(list, idx + 1);
    }

    private int getValIfPresent(List<Integer> list, int idx) {
        if(idx < 0 || idx > list.size() - 1) {
            return 1;
        }
        return list.get(idx);
    }

}
