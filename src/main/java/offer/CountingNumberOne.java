package offer;

public class CountingNumberOne {

    public static int count(int n) {
        if(n < 0) {
            return count(-1 * n);
        }

        String str = String.valueOf(n);
        int len = str.length();
        if(len == 0) {
            return 0;
        }
        if(len == 1) {
            return n == 0 ? 0 : 1;
        }
        int first = Integer.parseInt(str.substring(0, 1));
        int last = Integer.parseInt(str.substring(1));

        int numberOfFirst = 0;
        if(first > 1) {
            numberOfFirst = (int) Math.pow(10, first);
        }else if(first == 1) {
            numberOfFirst = last + 1;
        }
        int numberOfOtherDigit = first * (len - 1) * ((int)Math.pow(10, len - 2));
        int numberOfRecur = count(last);
        return numberOfFirst + numberOfOtherDigit + numberOfRecur;
    }

}
