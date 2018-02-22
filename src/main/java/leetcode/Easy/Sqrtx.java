package leetcode.Easy;

/**
 * Problem Url: https://leetcode.com/problems/sqrtx
 */
public class Sqrtx {

    public int mySqrt(int x) {
        if(x == 0) {
            return 0;
        }
        long prev = 1;
        for (long i = 1; i <= x; i++) {
            if((i * i) <= x) {
                prev = i;
            }else {
                break;
            }
        }
        return (int) prev;
    }

}
