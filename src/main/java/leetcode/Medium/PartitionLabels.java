package leetcode.Medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *  https://leetcode.com/problems/partition-labels/description/
 */
public class PartitionLabels {

    public List<Integer> partitionLabels(String s) {
        if(s == null) {
            return null;
        }
        char[] chars = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            map.put(chars[i], i);
        }
        int i = 0, right = -1;
        int prev = -1;
        List<Integer> list = new ArrayList<>();
        while(i < chars.length) {
            Integer idx = map.get(chars[i]);
            right = Math.max(idx, right);
            if(i == right) {
                list.add(right - prev);
                prev = i;
            }
            i++;
        }
        return list;
    }

}
