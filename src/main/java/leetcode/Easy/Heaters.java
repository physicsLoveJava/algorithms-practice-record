package leetcode.Easy;

import java.util.Arrays;

/**
 * Problem Url: https://leetcode.com/problems/heaters
 */
public class Heaters {
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(heaters);
        int rs = Integer.MIN_VALUE;
        for (int house : houses) {
            int index = Arrays.binarySearch(heaters, house);
            if(index < 0) {
                index = -(index + 1);
            }
            int left = index - 1 >= 0 ? house - heaters[index - 1] : Integer.MAX_VALUE;
            int right = index <= heaters.length - 1 ? heaters[index] - house : Integer.MAX_VALUE;
            rs = Math.max(rs, Math.min(left, right));
        }
        return rs;
    }
}
