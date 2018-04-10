package leetcode.Easy;

/**
 * Problem Url: https://leetcode.com/problems/count-binary-substrings
 */
public class CountBinarySubstrings {

    public int countBinarySubstrings(String s) {
        if(s == null || s.length() < 2) {
            return 0;
        }
        int count = 1;
        char prev = s.charAt(0);
        int sum = 0;
        for (int i = 1; i < s.length();) {
            while(i < s.length() && s.charAt(i) == prev) {
                count++;
                i++;
            }
            int subCount = 0;
            while(i < s.length() && s.charAt(i) != prev) {
                subCount++;
                i++;
            }
            int min = Math.min(count, subCount);
            sum += min;
            count = subCount;
            prev = negative(prev);
        }
        return sum;
    }

    private char negative(char prev) {
        return prev == '1' ? '0' : '1';
    }

}
