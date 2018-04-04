package leetcode.Easy;

/**
 * Problem Url: https://leetcode.com/problems/number-complement
 */
public class NumberComplementSp1 {

    public int findComplement(int num) {
        return ~num & ((Integer.highestOneBit(num) << 1) - 1);
    }

}
