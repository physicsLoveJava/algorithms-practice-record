package leetcode.Medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Problem Url: https://leetcode.com/problems/can-i-win
 */
public class CanIWin {

    public boolean canIWin(int maxChoosableInteger, int desiredTotal) {
        int sum = (maxChoosableInteger + 1) * maxChoosableInteger / 2;
        if(sum < desiredTotal) {
            return false;
        }
        if(desiredTotal <= 0) {
            return true;
        }
        Map<String, Boolean> map = new HashMap<>();
        boolean[] used = new boolean[maxChoosableInteger + 1];
        return find(map, used, desiredTotal);
    }

    private boolean find(Map<String, Boolean> map, boolean[] used, int desiredTotal) {
        if(desiredTotal <= 0) {
            return false;
        }
        String key = Arrays.toString(used);
        if(!map.containsKey(key)) {
            for (int i = 1; i < used.length; i++) {
                if(!used[i]) {
                    used[i] = true;
                    if(!find(map, used, desiredTotal - i)) {
                        map.put(key, true);
                        used[i] = false;
                        return true;
                    }
                    used[i] = false;
                }
            }
            map.put(key, false);
        }
        return map.get(key);
    }

}
