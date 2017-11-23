package offer;


public class CountingNumber {

    private static char[] chars = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

    public static void count(int len) {
        if(len <= 0) {
            return;
        }
        printNumber(chars, len, "");
    }

    private static void printNumber(char[] charArray, int len, String str) {
        if(len == 0) {
            print(str);
            return;
        }
        for (int i = 0; i < charArray.length; i++) {
            printNumber(charArray, len - 1, str + charArray[i]);
        }
    }

    private static void print(String str) {
        if(str.startsWith("0")) {
            print(str.substring(1));
            return;
        }
        System.out.println(str);
    }

}
