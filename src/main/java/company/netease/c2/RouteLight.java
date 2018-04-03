package company.netease.c2;

import java.util.Scanner;

public class RouteLight {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            String route = scanner.next();
            System.out.println(minLight(route));
        }
    }

    private static int minLight(String route) {
        int count = 0;
        int i = 0;
        while(i < route.length()) {
            if(route.charAt(i) == 'X') {
                i++;
            }else {
                if(i + 1 < route.length()) {
                    i += 3;
                }else {
                    i++;
                }
                count ++;
            }
        }
        return count;
    }

}
