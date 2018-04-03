package leetcode.Easy;

/**
 * Problem Url: https://leetcode.com/problems/arranging-coins
 */
public class ArrangingCoins {

    public int arrangeCoins(int n) {
        long start = 1, end = n;
        while(start <= end) {
            long mid = (start + end) >>> 1;
            long val = (mid + 1) * mid / 2;
            long val2 = (mid + 2) * (mid + 1) / 2;
            if(val > n) {
                end = mid - 1;
            }else if(val2 < n){
                start = mid + 1;
            }else {
                return (int) (val2 == n ? mid + 1 : mid);
            }
        }
        return 0;
    }

}
