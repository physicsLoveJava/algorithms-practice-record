package company.netease.c2;

import java.util.Scanner;

public class MissingPeople {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextInt();
        String next = scanner.next();
        int l = 0, r = 0;
        for (int ni = 0; ni < next.length(); ni++) {
            if(next.charAt(ni) == 'L') {
                l ++;
            }else {
                r ++;
            }
        }

        int diff = r - l;
        if(diff > 0) {
            diff = diff % 4;
        }else {
            diff = 4 - (-diff % 4);
            diff %= 4;
        }
        switch (diff) {
            case 0:
                System.out.println("N");
                break;
            case 1:
                System.out.println("E");
                break;
            case 2:
                System.out.println("S");
                break;
            case 3:
                System.out.println("W");
                break;
        }
    }
}
