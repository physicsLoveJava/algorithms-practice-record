package leetcode.Medium;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * https://leetcode.com/problems/delete-and-earn/description/
 */
public class DeleteAndEarn1 {

    public static int deleteAndEarn(int[] nums) {
        int[] count = new int[10001];
        for (int i = 0; i < nums.length; i++) {
            count[nums[i]] += 1;
        }
        int pick = 0, unpick = 0, prev = -1;
        for (int i = 0; i < count.length; i++) {
            int cur = Math.max(pick, unpick);
            if(count[i] > 0) {
                if(i - 1 != prev) {
                    pick = i * count[i] + cur;
                    unpick = cur;
                }else {
                    pick = i * count[i] + unpick;
                    unpick = cur;
                }
            }
            prev = i;
        }
        return Math.max(pick, unpick);
    }

}
