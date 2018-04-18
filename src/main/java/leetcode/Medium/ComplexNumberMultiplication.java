package leetcode.Medium;

/**
 * Problem Url: https://leetcode.com/problems/complex-number-multiplication
 */
public class ComplexNumberMultiplication {

    class Complex {
        int real;
        int virtual;

        public Complex multiply(Complex o) {
            Complex rs = new Complex();
            rs.real = real * o.real - virtual * o.virtual;
            rs.virtual = real * o.virtual + virtual * o.real;
            return rs;
        }

        @Override
        public String toString() {
            return real + "+" + virtual + "i";
        }
    }

    public String complexNumberMultiply(String a, String b) {
        Complex c1 = toComplex(a);
        Complex c2 = toComplex(b);
        return c1.multiply(c2).toString();
    }

    private Complex toComplex(String a) {
        int plus = a.indexOf("+");
        int vi = a.indexOf("i");
        Complex c = new Complex();
        c.real = Integer.valueOf(a.substring(0, plus));
        c.virtual = Integer.valueOf(a.substring(plus + 1, vi));
        return c;
    }

}
