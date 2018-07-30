package company.pdd;

import java.util.Arrays;
import java.util.Scanner;

public class SplitChocolate {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int m = scanner.nextInt();
            int[] hArr = new int[m];
            for (int i = 0; i < m; i++) {
                hArr[i] = scanner.nextInt();
            }

            int n = scanner.nextInt();
            int[] wArr = new int[n];
            for (int i = 0; i < n; i++) {
                wArr[i] = scanner.nextInt();
            }
            System.out.println(maxPerform(hArr, wArr));
        }

    }

    private static int maxPerform(int[] hArr, int[] wArr) {
        Arrays.sort(hArr);
        Arrays.sort(wArr);
        int total = 0;
        int lastIdx = wArr.length - 1;
        for (int i = hArr.length - 1; i >= 0; i--) {
            if(lastIdx < 0) {
                break;
            }
            if(hArr[i] > wArr[lastIdx]) {
                continue;
            }
            lastIdx --;
            total ++;
        }
        return total;
    }

}
