package leetcode.Easy;

import java.util.HashSet;
import java.util.Set;

/**
 * Problem Url: https://leetcode.com/problems/ransom-note
 */
public class RansomNote {

    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote == null || magazine == null) {
            return false;
        }
        if(ransomNote.length() == 0) {
            return true;
        }
        if(magazine.length() == 0) {
            return false;
        }
        int i = 0;
        Set<Integer> set = new HashSet<>();
        while(i < ransomNote.length()) {
            boolean found = false;
            int j = 0;
            while(j < magazine.length()) {
                if(!set.contains(j) && ransomNote.charAt(i) == magazine.charAt(j)) {
                    found = true;
                    break;
                }else {
                    j++;
                }
            }
            if(!found) {
                return false;
            }
            i++;
            set.add(j);
        }
        return true;
    }

}
