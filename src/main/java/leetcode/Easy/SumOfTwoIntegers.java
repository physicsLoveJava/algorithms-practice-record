package leetcode.Easy;

/**
 * Problem Url: https://leetcode.com/problems/sum-of-two-integers
 */
public class SumOfTwoIntegers {

    public int getSum(int a, int b) {
        return b == 0 ? a : getSum(a ^ b, (a & b) << 1);
    }

}