package company.microsoft.c1;

import java.util.Scanner;

public class ArithmeticExpression {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int minIndex = -1;
        double min = Integer.MIN_VALUE;
        while(n-- > 0) {
            String s = scanner.nextLine();
            int opIndx = -1;
            int op = -1;
            if(s.contains("+")) {
                opIndx = s.indexOf("+");
                op = 1;
            }else if(s.contains("-")) {
                opIndx = s.indexOf("-");
                op = 2;
            }else if(s.contains("*")) {
                opIndx = s.indexOf("*");
                op = 3;
            }else  {
                opIndx = s.indexOf("/");
                op = 4;
            }
            System.out.println(s);
            System.out.println(opIndx);
            int a = Integer.parseInt(s.substring(0, opIndx));
            int b = Integer.parseInt(s.substring(opIndx + 1, s.length()));
            double rs = 0;
            switch (op) {
                case 1:
                    rs = a + b;
                    break;
                case 2:
                    rs = a - b;
                    break;
                case 3:
                    rs = a * b;
                    break;
                case 4:
                    rs = (double)a / b;
                    break;
            }
            double diff = Math.abs(rs - 9);
            if(diff < min) {
                min = diff;
                minIndex = n;
            }
        }
        System.out.println(minIndex);
    }

}
