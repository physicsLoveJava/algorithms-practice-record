package leetcode.contest.c3;

import java.util.Scanner;

public class ReOrder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int a = 0, b = 0, c = 0;
            for (int j = 0; j < n; j++) {
                int val = scanner.nextInt();
                if((val % 4) == 0) {
                    c++;
                }else if((val % 2) == 0) {
                    b++;
                }else {
                    a++;
                }
            }
            if(c < a - 1) {
                System.out.println("No");
            }else if(c >= 1 && c == a - 1 && b == 0) {
                System.out.println("Yes");
            }else if(c >= a) {
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }
    }

}
