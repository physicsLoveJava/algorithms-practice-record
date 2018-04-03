package company.netease.c2;

import java.util.Arrays;
import java.util.Scanner;

public class GetUp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt() * 60 + scanner.nextInt();
        }
        int dist = scanner.nextInt();
        int deadline = scanner.nextInt() * 60 + scanner.nextInt() - dist;
        Arrays.sort(arr);
        int idx = Arrays.binarySearch(arr, deadline);
        if(idx < 0) {
            idx = ~idx - 1;
        }
        System.out.println(arr[idx] / 60 + " " + arr[idx] % 60);
    }

    static class Test {
        public static void main(String[] args) {
            int x = -3;
            System.out.println(~x);
        }
    }
}
