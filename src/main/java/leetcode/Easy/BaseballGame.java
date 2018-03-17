package leetcode.Easy;

import java.util.Stack;

/**
 * Problem Url: https://leetcode.com/problems/baseball-game
 */
public class BaseballGame {

    public int calPoints(String[] ops) {

        if(ops == null) {
            return 0;
        }

        Stack<Integer> stack = new Stack<>();
        for (String op : ops) {
            switch (op) {
                case "+":
                    Integer s1 = stack.pop();
                    Integer s2 = stack.pop();
                    int s3 = s1 + s2;
                    stack.push(s2);
                    stack.push(s1);
                    stack.push(s3);
                    break;
                case "D":
                    stack.push(stack.peek() * 2);
                    break;
                case "C":
                    stack.pop();
                    break;
                default:
                    int s = Integer.parseInt(op);
                    stack.push(s);
                    break;
            }
        }
        int count = 0;
        while(!stack.isEmpty()) {
            count += stack.pop();
        }

        return count;
    }

}
