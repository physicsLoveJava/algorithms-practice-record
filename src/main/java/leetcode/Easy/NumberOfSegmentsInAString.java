package leetcode.Easy;

/**
 * Problem Url: https://leetcode.com/problems/number-of-segments-in-a-string
 */
public class NumberOfSegmentsInAString {

    public int countSegments(String s) {
        String[] split = s.split(" ");
        int count = 0;
        for (String s1 : split) {
            if(!"".equals(s1)) {
                count++;
            }
        }
        return "".equals(s) ? 0 : count;
    }

}
