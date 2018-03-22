package leetcode.contest.c1;

import java.util.Scanner;

public class StringSwapping {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
            String str = scanner.nextLine();
            System.out.println(swapping(str));
        }

    }

    private static String swapping(String str) {
        int p1 = str.length() - 1, p2 = p1;
        char[] chars = str.toCharArray();
        while(p1 >= 0 && p2 >= 1) {
            if(Character.isUpperCase(chars[p1])
                    && Character.isUpperCase(chars[p2])) {
                char temp = chars[p1];
                for (int i = p1 + 1; i < p2; i++) {
                    chars[i - 1] = chars[i];
                }
                if(p1 + 1 < p2) {
                    chars[p2 - 1] = temp;
                }
                p2--;
            }else if(Character.isUpperCase(chars[p1])) {
                char temp = chars[p1];
                for (int i = p1 + 1; i <= p2; i++) {
                    chars[i - 1] = chars[i];
                }
                if(p1 + 1 <= p2) {
                    chars[p2] = temp;
                    p2--;
                }
            }
            p1--;
        }
        return new String(chars);
    }

}
