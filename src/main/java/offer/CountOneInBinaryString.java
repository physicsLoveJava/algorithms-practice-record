package offer;

public class CountOneInBinaryString {

    public static int count(int n) {
        if(n == 0) {
            return 0;
        }
        if(n < 0) {
            return count(-n);
        }
        int x = 0;
        while(n > 0) {
            n = n & (n - 1);
            x++;
        }
        return x;
    }

}
