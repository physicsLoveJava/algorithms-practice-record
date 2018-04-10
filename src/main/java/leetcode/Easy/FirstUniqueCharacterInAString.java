package leetcode.Easy;

/**
 * Problem Url: https://leetcode.com/problems/first-unique-character-in-a-string
 */
public class FirstUniqueCharacterInAString {

    public int firstUniqChar(String s) {
        if(s == null || s.length() == 0) {
            return -1;
        }
        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a'] += 1;
        }
        int idx = -1;
        for (int i = 0; i < s.length(); i++) {
            if(arr[s.charAt(i) - 'a'] == 1) {
                idx = i;
                break;
            }
        }
        return idx;
    }

}
