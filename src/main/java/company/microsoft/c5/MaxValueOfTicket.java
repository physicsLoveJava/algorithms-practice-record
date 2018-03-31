package company.microsoft.c5;

import java.util.Scanner;

public class MaxValueOfTicket {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int h = scanner.nextInt();
        int[] needs = new int[n];
        int[] values = new int[n];
        for (int i = 0; i < n; i++) {
            needs[i] = scanner.nextInt();
            values[i] = scanner.nextInt();
        }
        System.out.println(compute(needs, values, h, 0));
    }

    private static int compute(int[] needs, int[] values, int h, int idx) {
        int max = 0;
        for (int i = idx; i < needs.length; i++) {
            if(h >= needs[i]) {
                int tmp = compute(needs, values, h - needs[i], i + 1) + values[i];
                if(tmp > max) {
                    max = tmp;
                }
            }
        }
        return max;
    }
}
