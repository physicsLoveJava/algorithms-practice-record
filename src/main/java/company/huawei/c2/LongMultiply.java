package company.huawei.c2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LongMultiply {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String s1 = scanner.next();
            String s2 = scanner.next();
            System.out.println(multiply(s1, s2));
        }

    }

    private static String multiply(String s1, String s2) {
        if(s1.length() < s2.length()) {
            return multiply(s2, s1);
        }
        List<String> list = new ArrayList<>();
        for (int i = 0; i < s2.length(); i++) {
            list.add(multiplySingle(s1, s2.charAt(i), s2.length() - 1 - i));
        }
        String cur = "";
        for (String s : list) {
            cur = addByBit(s, cur);
        }
        return cur;
    }

    private static String addByBit(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1, j = b.length() - 1;
        int carry = 0;
        while(i >=0 || j >= 0) {
            int val = 0;
            if(i >= 0) {
                val += a.charAt(i--) - '0';
            }
            if(j >= 0) {
                val += b.charAt(j--) - '0';
            }
            val += carry;
            sb.append(val % 10);
            carry = val / 10;
        }
        if(carry != 0) {
            sb.append(carry);
        }
        return sb.reverse().toString();
    }

    private static String multiplySingle(String s1, char ch, int bit) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int times = ch - '0';
        for (int i = 0; i < bit; i++) {
            sb.append(0);
        }
        for (int i = s1.length() - 1; i >= 0; i--) {
            int x = s1.charAt(i) - '0';
            int val = x * times;
            val += carry;
            sb.append(val % 10);
            carry = val / 10;
        }
        if(carry != 0) {
            sb.append(carry);
        }
        return sb.reverse().toString();
    }

}
