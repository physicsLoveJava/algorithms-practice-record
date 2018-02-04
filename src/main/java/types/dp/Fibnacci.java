package types.dp;

public class Fibnacci {

    public static int fib(int x) {
        int a = 0, b = 1, sum = 0;
        for (int i = 0; i < x; i++) {
            sum = a + b;
            a = sum;
            b = a;
        }
        return sum;
    }

}
