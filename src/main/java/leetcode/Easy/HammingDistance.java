package leetcode.Easy;

/**
 * Problem Url: https://leetcode.com/problems/hamming-distance
 */
public class HammingDistance {

    public int hammingDistance(int x, int y) {
        int z = x ^ y;
        int dist = 0;
        for (int i = 0; i < 31; i++) {
            if((z & 1) == 1) {
                dist ++;
            }
            z >>= 1;
        }
        return dist;
    }

}
