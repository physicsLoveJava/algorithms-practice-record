package company.netease.c2;

import java.util.Scanner;

public class FindNumberInRange {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int r = scanner.nextInt();
        int diff = r - l + 1;
        if(diff % 3 == 0) {
            System.out.println(diff * 2 / 3);
        }
        if(diff % 3 == 1) {
            System.out.println((diff - 1) * 2 / 3 + (r % 3 == 1 ? 0 : 1));
        }
        if(diff % 3 == 2) {
            System.out.println((diff - 2) * 2 / 3 + (r % 3 == 1 ? 0 : 1) + ((r - 1) % 3 == 1 ? 0 : 1));
        }
    }

}
