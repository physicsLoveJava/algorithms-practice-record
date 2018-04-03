package company.netease.c2;

import java.util.Scanner;

public class BagPack {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int w = scanner.nextInt();
        int[] arr = new int[n];
        long sum = 0; // 在出现和的时候要小心程序中整数的溢出
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }
        if(sum <= w) {
            System.out.println((int)Math.pow(2, n));
        }else {
            System.out.println(maxMeans(w, arr, 0) + 1);
        }
    }

    private static int maxMeans(int w, int[] arr, int idx) {
        if(w < 0) {
            return 0;
        }
        if(idx > arr.length - 1) {
            return 0;
        }
        int count = 0;
        if(arr[idx] <= w) {
            count += 1;
        }
        return maxMeans(w, arr, idx + 1) + maxMeans(w - arr[idx], arr, idx + 1) + count;
    }

}
