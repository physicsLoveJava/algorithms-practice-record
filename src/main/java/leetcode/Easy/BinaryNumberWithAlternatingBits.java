package leetcode.Easy;

/**
 * Problem Url: https://leetcode.com/problems/binary-number-with-alternating-bits
 */
public class BinaryNumberWithAlternatingBits {

    public boolean hasAlternatingBits(int n) {
        return ( ((long)n + (n>>1) + 1) & ( (long)n + (n>>1) )) == 0;
    }

}
