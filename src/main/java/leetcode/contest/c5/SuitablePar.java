package leetcode.contest.c5;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SuitablePar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Set<String> list = parString(n);
        StringBuilder sb = new StringBuilder();
        for (String s : list) {
            sb.append(s).append(",");
        }
        System.out.println(sb.substring(0, sb.length() - 1));
    }

    private static Set<String> parString(int n) {
        if(n == 1) {
            return new TreeSet<>(Arrays.asList("()"));
        }
        Set<String> subList = parString(n - 1);
        Set<String> rs = new TreeSet<>();
        for (String s : subList) {
            rs.add("(" + s + ")");
            rs.add(s + "()");
            rs.add("()" + s);
        }
        return rs;
    }

}
