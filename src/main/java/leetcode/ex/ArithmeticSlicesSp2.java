package leetcode.ex;

public class ArithmeticSlicesSp2 {

    public int numberOfArithmeticSlices(int[] A) {
        int dp = 0;
        int sum = 0;
        for (int i = 2; i < A.length; i++) {
            if(A[i] - A[i - 1] == A[i - 1] - A[i - 2]) {
                dp += 1;
                sum += dp;
            }else {
                dp = 0;
            }
        }
        return sum;
    }

}
