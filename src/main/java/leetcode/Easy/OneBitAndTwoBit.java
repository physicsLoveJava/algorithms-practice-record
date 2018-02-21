package leetcode.Easy;

/**
 * https://leetcode.com/problems/1-bit-and-2-bit-characters/description/
 */
public class OneBitAndTwoBit {

    public static boolean isOneBitCharacter(int[] bits) {

        if(bits == null || bits.length == 0) {
            throw new IllegalArgumentException();
        }

        int i = 0;
        while(i < bits.length - 1) {
            if(bits[i] == 0) {
                i += 1;
            }else  {
                i += 2;
                if(i > bits.length - 1) {
                    return false;
                }
            }
        }
        return true;
    }

}
