package leetcode.Easy;

/**
 * Problem Url: https://leetcode.com/problems/repeated-substring-pattern
 */
public class RepeatedSubstringPattern {

    public boolean repeatedSubstringPattern(String s) {
        char[] chars = s.toCharArray();
        for (int i = 1; i <= chars.length / 2; i++) {
            if((chars.length % i) == 0) {
                int k = chars.length / i;
                boolean isNegative = false;
                for (int j = 1; j < k; j++) {
                    for (int l = 0; l < i; l++) {
                        if(chars[j * i + l] != chars[l]) {
                            isNegative = true;
                            break;
                        }
                    }
                    if(isNegative) {
                        break;
                    }
                }
                if(!isNegative) {
                    return true;
                }
            }
        }
        return false;
    }

}
