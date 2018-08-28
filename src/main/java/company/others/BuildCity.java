package company.others;

import java.util.Arrays;
import java.util.Scanner;

public class BuildCity {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int[] xa = new int[n];
            int[] ya = new int[n];
            for (int i = 0; i < n; i++) {
                xa[i] = scanner.nextInt();
                ya[i] = scanner.nextInt();
            }
            Arrays.sort(xa);
            Arrays.sort(ya);
            long xd = xa[xa.length - 1] - xa[0];
            long yd = ya[ya.length - 1] - ya[0];
            System.out.println(xd * yd);
        }

    }

}
