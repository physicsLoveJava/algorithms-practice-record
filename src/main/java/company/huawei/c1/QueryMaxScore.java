package company.huawei.c1;

import java.util.Scanner;

public class QueryMaxScore {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            for (int i = 0; i < m; i++) {
                String op = scanner.next();
                if(op.equals("Q")) {
                    int s = scanner.nextInt();
                    int e = scanner.nextInt();
                    int max = Integer.MIN_VALUE;
                    for (int j = Math.min(s, e) - 1; j < Math.max(s, e); j++) {
                        if(arr[j] > max) {
                            max = arr[j];
                        }
                    }
                    System.out.println(max);
                }else {
                    int idx = scanner.nextInt();
                    int val = scanner.nextInt();
                    arr[idx - 1] = val;
                }
            }
        }
    }

}
