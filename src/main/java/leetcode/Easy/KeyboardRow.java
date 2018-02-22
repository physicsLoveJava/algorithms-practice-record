package leetcode.Easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Problem Url: https://leetcode.com/problems/keyboard-row
 */
public class KeyboardRow {

    static Map<String, Integer> map = new HashMap<String, Integer>() {
        {
            put("q", 1);
            put("w", 1);
            put("e", 1);
            put("r", 1);
            put("t", 1);
            put("y", 1);
            put("u", 1);
            put("i", 1);
            put("o", 1);
            put("p", 1);

            put("a", 2);
            put("s", 2);
            put("d", 2);
            put("f", 2);
            put("g", 2);
            put("h", 2);
            put("j", 2);
            put("k", 2);
            put("l", 2);

            put("z", 3);
            put("x", 3);
            put("c", 3);
            put("v", 3);
            put("b", 3);
            put("n", 3);
            put("m", 3);
        }
    };

    public String[] findWords(String[] words) {
        if(words == null || words.length == 0) {
            return words;
        }
        List<String> oneRow = new ArrayList<>();
        for (String word : words) {
            if(isOneRow(word)) {
                oneRow.add(word);
            }
        }
        return oneRow.toArray(new String[0]);
    }

    private boolean isOneRow(String word) {
        char[] chars = word.toCharArray();
        Integer x = null;
        for (char aChar : chars) {
            String ch = String.valueOf(aChar).toLowerCase();
            if(x != null && !map.get(ch).equals(x)) {
                return false;
            }else {
                x = map.get(ch);
            }
        }
        return true;
    }

}
