package leetcode.Easy;

/**
 * Problem Url: https://leetcode.com/problems/valid-perfect-square
 */
public class ValidPerfectSquare {

    public boolean isPerfectSquare(int num) {
        if(num < 0) {
            return false;
        }
        if(num == 1) {
            return true;
        }
        long start = 1, end = num / 2;
        while(start <= end) {
            long mid = (start + end) >>> 1;
            long val = mid * mid;
            if(val == num) {
                return true;
            }else if(val > num) {
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }
        return false;
    }

//    public static void main(String[] args) {
//        int a = Integer.MAX_VALUE / 2 + 10;
//        int b = Integer.MAX_VALUE / 2 + 12;
//        int d = Integer.MAX_VALUE / 2 + 11;
//        int c = (a + b) >>> 1;
//        int f = (a + b) / 2;
//        long g = Integer.MAX_VALUE + 10; //wrong
//        System.out.println(c == d);
//        System.out.println(f == d);
//    }

}
