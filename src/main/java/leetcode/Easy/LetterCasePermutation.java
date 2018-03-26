package leetcode.Easy;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/letter-case-permutation/description/
 */
public class LetterCasePermutation {

    public List<String> letterCasePermutation(String s) {
        List<String> rs = new ArrayList<>();
        if(s == null) {
            return rs;
        }
        char[] chars = s.toCharArray();
        recursive(chars, rs, 0);
        return rs;
    }

    private void recursive(char[] chars, List<String> rs, int idx) {
        if(idx > chars.length - 1) {
            rs.add(new String(chars));
            return;
        }
        char tmp = chars[idx];
        if(Character.isLetter(tmp)) {
            chars[idx] = Character.toLowerCase(tmp);
            recursive(chars, rs, idx + 1);
            chars[idx] = Character.toUpperCase(tmp);
            recursive(chars, rs, idx + 1);
        }else {
            recursive(chars, rs, idx + 1);
        }
    }

}
