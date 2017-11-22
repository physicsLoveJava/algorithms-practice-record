package offer;

public class Fibonacci {

    private static int[] fibs = new int[1024];

    public static int fib(int k) {
        if(fibs[k] != 0) {
            return fibs[k];
        }else {
            if(k <= 0) {
                fibs[0] = 1;
                return 1;
            }
            if(k == 1) {
                fibs[1] = 1;
                return 1;
            }
            for (int i = 0; i < k; i++) {
                fib(i);
            }
            fibs[k] = fibs[k - 1] + fibs[k - 2];
            return fibs[k];
        }
    }

}
