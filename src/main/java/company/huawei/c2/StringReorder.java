package company.huawei.c2;

import java.util.Scanner;

public class StringReorder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String s = scanner.next();
            int[] arr = new int[256];
            int max = 0;
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                arr[ch] += 1;
                max = Math.max(max, arr[ch]);
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < max; i++) {
                for (int j = 0; j < arr.length; j++) {
                    if(arr[j] != 0) {
                        sb.append((char)j);
                        arr[j] -= 1;
                    }
                }
            }
            System.out.println(sb.toString());
        }
    }

}
