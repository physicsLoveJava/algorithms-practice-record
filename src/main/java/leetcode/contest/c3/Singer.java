package leetcode.contest.c3;

import java.util.Scanner;

public class Singer {

    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int[] visited = new int[n];
        dfs(arr, visited, 0);
        System.out.println(min);
    }

    private static void dfs(int[] arr, int[] visited, int idx) {
        if(idx > arr.length - 1) {
            int val = calculate(arr, visited);
            if(val < min) {
                min = val;
            }
            return;
        }
        visited[idx] = -1;
        dfs(arr, visited, idx + 1);
        visited[idx] = 1;
        dfs(arr, visited, idx + 1);
    }

    private static int calculate(int[] arr, int[] visited) {
        Integer a = null, b = null;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(visited[i] == -1) {
                if(a == null) {
                    a = arr[i];
                }else {
                    count += Math.abs(arr[i] - a);
                    a = arr[i];
                }
            }
            if(visited[i] == 1) {
                if(b == null) {
                    b = arr[i];
                }else {
                    count += Math.abs(arr[i] - b);
                    b = arr[i];
                }
            }
        }
        return count;
    }

}
