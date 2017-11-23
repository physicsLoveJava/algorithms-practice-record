package offer;

public class Power {

    public static double power(double base, int exponent) {
        if(equal(base, 0) && exponent < 0) {
            throw new IllegalArgumentException("cant\'t do power with zero base and negative exponent!");
        }
        if(exponent < 0) {
            double result = power(base, -exponent);
            return 1.0 / result;
        }
        if(exponent == 0) {
            return 1;
        }
        if(exponent == 1) {
            return base;
        }
        double result = power(base, exponent >> 1);
        result *= result;
        if((exponent & 0x1) == 1) {
            result *= base;
        }
        return result;
    }

    private static boolean equal(double base, int val) {
        double sub = base - val;
        double baseline = 0.0000001;
        if(sub < baseline && sub > -1 * baseline) {
            return true;
        }
        return false;
    }

}
