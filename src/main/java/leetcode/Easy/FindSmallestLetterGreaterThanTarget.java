package leetcode.Easy;

/**
 * Problem Url: https://leetcode.com/problems/find-smallest-letter-greater-than-target
 */
public class FindSmallestLetterGreaterThanTarget {

    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0, end = letters.length - 1;
        int found = -1;
        while(start <= end) {
            int mid = (start + end) >>> 1;
            if(letters[mid] == target) {
                found = mid;
                break;
            }else if(letters[mid] > target) {
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }
        if(found == -1) {
            found = start;
            return letters[found % letters.length];
        }
        while(found < letters.length && letters[found] == target) {
            found++;
        }
        return letters[found % letters.length];
    }

}
