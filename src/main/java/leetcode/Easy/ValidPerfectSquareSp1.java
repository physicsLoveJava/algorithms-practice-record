package leetcode.Easy;

/**
 * Problem Url: https://leetcode.com/problems/valid-perfect-square
 */
public class ValidPerfectSquareSp1 {

    public boolean isPerfectSquare(int num) {
        long x = num;
        while(x * x > num) {
            x = (x + num / x) >> 1;
        }
        return x * x == num;
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
