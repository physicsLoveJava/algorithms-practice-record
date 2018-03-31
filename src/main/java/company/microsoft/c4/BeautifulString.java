package company.microsoft.c4;

import java.util.Arrays;
import java.util.Scanner;

public class BeautifulString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for (int i = 0; i < a; i++) {
            scanner.nextInt();
            String s = scanner.next();
            System.out.println(isBeautiful(s) ? "YES" : "NO");
        }
    }

    private static boolean isBeautiful(String s) {
        int[] dp = new int[s.length()];
        Arrays.fill(dp, 1);
        int max = 1;
        for (int i = 1; i < s.length(); i++) {
            int diff = s.charAt(i) - s.charAt(i - 1);
            if(diff == 0) {
                dp[i] = dp[i - 1];
            }else if(diff == 1) {
                dp[i] = dp[i - 1] + 1;
            }else {
                dp[i] = 1;
            }
            if(max < dp[i]) {
                max = dp[i];
            }
        }
        System.out.println(s);
        System.out.println(Arrays.toString(dp));
        return max >= 3;
    }

}
