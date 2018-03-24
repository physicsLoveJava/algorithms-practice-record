package leetcode.contest.c3;

import java.util.Scanner;
import java.util.Stack;

public class ReverseNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(reverseNumber(n));

    }

    private static int reverseNumber(int n) {
        Stack<Character> stack = new Stack<>();
        char[] chars = String.valueOf(n).toCharArray();
        for (char aChar : chars) {
            stack.push(aChar);
        }
        StringBuilder sb = new StringBuilder();
        boolean first = true;
        while(!stack.isEmpty()) {
            if(first && stack.peek().equals('0')) {
                stack.pop();
            }else {
                sb.append(stack.pop());
                first = false;
            }
        }
        if(sb.toString().equals("")) {
            return n;
        }else {
            return Integer.parseInt(sb.toString()) + n;
        }
    }

}
