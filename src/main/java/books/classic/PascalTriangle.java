package books.classic;

public class PascalTriangle {

    public static void print(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(oneRow(i));
        }
    }

    private static String oneRow(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= n; i++) {
            sb.append(combine(n, i)).append(" ");
        }
        return sb.toString();
    }

    private static int combine(int n, int k) {
        if(n == 0) {
            return 1;
        }
        if(k < 0) {
            return 0;
        }
        int result = 1;
        for (int i = 1; i <= k; i++) {
            result *= (n - i + 1);
        }
        for (int i = 1; i <= k; i++) {
            result /= i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(combine(3, 3));
    }

}
