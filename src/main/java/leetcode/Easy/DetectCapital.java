package leetcode.Easy;

/**
 * Problem Url: https://leetcode.com/problems/detect-capital
 */
public class DetectCapital {

    public boolean detectCapitalUse(String word) {
        if(word.equals(word.toLowerCase()) || word.equals(word.toUpperCase())) {
            return true;
        }
        String f = word.substring(0, 1);
        if(f.equals(f.toUpperCase())) {
            return word.substring(1).equals(word.substring(1).toLowerCase());
        }
        return false;
    }

}
