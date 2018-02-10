package books.wialgorithms.divide;

public class FastPower {

    public static double power(double base, int exp) {
        if(exp == 0) {
            return 1;
        }
        if(exp < 0) {
            return  1 / power(base, -1 * exp);
        }
        if(exp % 2 == 0) {
            double result = power(base, exp / 2);
            return result * result;
        }else {
            double result = power(base, (exp - 1) / 2);
            return result * result * base;
        }
    }

}
