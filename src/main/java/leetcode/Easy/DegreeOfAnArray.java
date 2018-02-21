package leetcode.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Problem Url: https://leetcode.com/problems/degree-of-an-array
 */
public class DegreeOfAnArray {

    public static int findShortestSubArray(int[] nums) {

        if(nums == null || nums.length == 0) {
            throw new IllegalArgumentException();
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            }else {
                map.put(nums[i], 1);
            }
        }
        int max = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(max < entry.getValue()) {
                max = entry.getValue();
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(max == entry.getValue()) {
                list.add(entry.getKey());
            }
        }
        int[] arr = new int[list.size()];
        int idx = 0;
        for (Integer item : list) {
            arr[idx++] = compute(nums, item);
        }
        Arrays.sort(arr);
        return arr[0];
    }

    private static int compute(int[] nums, Integer key) {
        int start = 0, end = nums.length - 1;
        while(start < nums.length) {
            if(nums[start] == key) {
                break;
            }
            start++;
        }
        while(end > -1) {
            if(nums[end] == key) {
                break;
            }
            end --;
        }
        return end - start + 1;
    }

}
