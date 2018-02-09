package leetcode.Medium;

/**
 * https://leetcode.com/problems/global-and-local-inversions/description/
 */
public class GlobalandLocalInversions {

    public static boolean isIdealPermutation(int[] a) {
        if(a == null || a.length == 0) {
            return false;
        }
        for (int i = 0; i < a.length - 1; i++) {
            if(a[i] > a[i + 1] + 1) {
                return false;
            }
        }
        return true;
    }

}
