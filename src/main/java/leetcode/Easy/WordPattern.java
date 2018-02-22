package leetcode.Easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Problem Url: https://leetcode.com/problems/word-pattern
 */
public class WordPattern {

    public boolean wordPattern(String pattern, String str) {
        if(pattern == null || str == null) {
            throw new IllegalArgumentException();
        }
        if(str.length() == 0) {
            return pattern.equals("");
        }
        if(pattern.length() == 0) {
            return str.equals("");
        }
        String[] split = str.split(" ");
        String[] ptns = pattern.split("");
        if(split.length != ptns.length) {
            return false;
        }
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < split.length; i++) {
            if (map.containsKey(ptns[i])) {
                if(!map.get(ptns[i]).equals(split[i])) {
                    return false;
                }
            }else {
                if(map.containsValue(split[i])) {
                    return false;
                }
                map.put(ptns[i], split[i]);
            }
        }
        return true;
    }

}
