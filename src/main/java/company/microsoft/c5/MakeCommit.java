package company.microsoft.c5;

import java.util.Scanner;

public class MakeCommit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int t = scanner.nextInt();
            int c = scanner.nextInt();
            int[] arr = new int[t + 1];
            for (int j = 0; j < t; j++) {
                arr[j + 1] = scanner.nextInt();
            }
            int max = 0;
            if(c >= t) {
                max = 100;
            }else {
                for (int j = 0; j < t - c; j++) {
                    arr[i] = arr[i + c + 1] - arr[i] - 1;
                    if(max < arr[i]) {
                        max = arr[i];
                    }
                }
            }
            System.out.println(max);
        }
    }

}
