package leetcode.contest.c5;

import java.util.Scanner;

public class UsingSubString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String using = isUsing(s);
        if(using.equals("")) {
            if(using.equals(s)) {
                System.out.println(s);
            }else{
                System.out.println(false);
            }
        }else {
            System.out.println(using);
        }
    }

    private static String isUsing(String s) {
        if(s.length() <= 1) {
            return s;
        }
        int n = s.length();
        for (int i = 1; i < n / 2; i++) {
            if(n % i == 0) {
                int start = 0;
                int end = i;
                String sub = s.substring(start, end);
                int k = n / i;
                boolean x = true;
                for (int j = 0; j < k; j++) {
                    boolean flag = true;
                    for (int l = 0; l < i; l++) {
                        if(s.charAt(j * i + l) != sub.charAt(l)) {
                            flag = false;
                            break;
                        }
                    }
                    if(!flag) {
                        x = false;
                        break;
                    }
                }
                if(x) {
                    return sub;
                }
            }
        }
        return "";
    }

}
