package books.classic;

public class Hanoi {

    public static void hanoi(int n, String a, String b, String c) {
        if(n < 0) {
            return;
        }
        if(n == 1) {
            move(1, a, c);
        }else {
            hanoi(n - 1, a, c, b);
            move(n, a, c);
            hanoi(n - 1, b, a, c);
        }
    }

    private static void move(int n, String source, String target) {
        System.out.println(String.format("move disc %s from %s to %s", n, source, target));
    }

}
