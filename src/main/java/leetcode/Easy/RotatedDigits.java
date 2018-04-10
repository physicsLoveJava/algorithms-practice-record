package leetcode.Easy;

/**
 * https://leetcode.com/problems/rotated-digits/description/
 */
public class RotatedDigits {

    public int rotatedDigits(int n) {
        int count = 0;
        for (int i = 1; i <= n ; i++) {
            if(isRotatedGood(i)) {
                count++;
            }
        }
        return count;
    }

    private boolean isRotatedGood(int i) {
        String s = String.valueOf(i);
        if(s.contains("3")
            || s.contains("4")
            || s.contains("7")) {
            return false;
        }
        if(s.contains("2")
                || s.contains("5")
                || s.contains("6")
                || s.contains("9")
                ) {
            return true;
        }
        return false;
    }

}
