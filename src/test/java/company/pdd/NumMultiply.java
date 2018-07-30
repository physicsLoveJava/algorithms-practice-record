package company.pdd;

import java.util.Scanner;

public class NumMultiply {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            String line = scan.nextLine();
            String a = line.split(" ")[0];
            String b = line.split(" ")[1];
            System.out.println(multiply(reverse(a), reverse(b)));
        }

    }

    private static String reverse(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >=0 ; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    private static String multiply(String a, String b) {
        if(a.length() > b.length()) {
            return multiply(b, a);
        }
        StringBuilder total = new StringBuilder();
        for (int j = 0; j < a.length(); j++) {
            int rest = 0;
            int carry = 0;
            StringBuilder sb = new StringBuilder();
            int cur = a.charAt(j) - '0';
            for (int i = 0; i < b.length(); i++) {
                int target = b.charAt(i) - '0';
                int sum = cur * target + carry;
                rest = sum % 10;
                carry = sum / 10;
                sb.insert(0, rest);
            }
            if(carry != 0) {
                sb.insert(0, carry);
            }
            for (int i = 0; i < j; i++) {
                sb.append('0');
            }
            total = plus(total, sb);
        }
        return total.toString();
    }

    private static StringBuilder plus(StringBuilder a, StringBuilder b) {
        if(a.length() > b.length()) {
            return plus(b, a);
        }
        String aStr = reverse(a.toString());
        String bStr = reverse(b.toString());
        StringBuilder rs = new StringBuilder();
        int rest = 0;
        int carry = 0;
        for (int i = 0; i < bStr.length(); i++) {
            int av = 0;
            if(i < aStr.length()) {
                av = aStr.charAt(i) - '0';
            }
            int bv = bStr.charAt(i) - '0';
            int sum = av + bv + carry;
            rest = sum % 10;
            carry = sum / 10;
            rs.insert(0, rest);
        }
        if(carry != 0) {
            rs.insert(0, carry);
        }
        return rs;
    }

}
