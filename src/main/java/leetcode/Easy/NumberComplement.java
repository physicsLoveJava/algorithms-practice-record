package leetcode.Easy;

/**
 * Problem Url: https://leetcode.com/problems/number-complement
 */
public class NumberComplement {

    public int findComplement(int num) {
        int pos = 0;
        while(num >> pos != 0) {
            pos++;
        }
        int opp = ~num;
        return (opp << (32 - pos)) >> (32 - pos);
    }

}
