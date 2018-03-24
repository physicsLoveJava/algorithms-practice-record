package leetcode.contest.c3;

import java.util.Scanner;

public class StringFragments {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.printf("%.2f", avgLen(s));
    }

    private static double avgLen(String s) {
        char[] chars = s.toCharArray();
        int counts = 1;
        char ch = chars[0];
        for (int i = 1; i < chars.length; i++) {
            if(ch != chars[i]) {
                ch = chars[i];
                counts++;
            }
        }
        return chars.length / (double)counts;
    }

}
