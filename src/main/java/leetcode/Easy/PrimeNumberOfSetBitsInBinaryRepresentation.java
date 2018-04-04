package leetcode.Easy;

/**
 * Problem Url: https://leetcode.com/problems/prime-number-of-set-bits-in-binary-representation
 */
public class PrimeNumberOfSetBitsInBinaryRepresentation {

    public int countPrimeSetBits(int L, int R) {
        int ans = 0;
        for (int x = L; x <= R; ++x)
            if (isSmallPrime(Integer.bitCount(x)))
                ans++;
        return ans;
    }
    public boolean isSmallPrime(int x) {
        return (x == 2 || x == 3 || x == 5 || x == 7 ||
                x == 11 || x == 13 || x == 17 || x == 19);
    }

}
