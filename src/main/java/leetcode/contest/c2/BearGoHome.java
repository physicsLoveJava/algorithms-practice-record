package leetcode.contest.c2;

import java.util.Scanner;

public class BearGoHome {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        int dist = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            dist += Math.abs(arr[i + 1] - arr[i]);
        }

        int max = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            int tmp = 0;
            if(arr[i - 1] < arr[i + 1]) {
                if(arr[i] > arr[i + 1]) {
                    tmp = 2 * Math.abs(arr[i + 1] - arr[i]);
                }
                if(arr[i] < arr[i - 1]) {
                    tmp = 2 * Math.abs(arr[i] - arr[i - 1]);
                }
            }else {
                if(arr[i] > arr[i - 1]) {
                    tmp = 2 * Math.abs(arr[i] - arr[i - 1]);
                }
                if(arr[i] < arr[i + 1]) {
                    tmp = 2 * Math.abs(arr[i + 1] - arr[i]);
                }
            }
            if(max < tmp) {
                max = tmp;
            }
        }
        System.out.println(dist - max);
    }

}
