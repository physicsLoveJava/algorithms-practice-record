package leetcode.Medium;

import java.util.Stack;

/**
 * https://leetcode.com/problems/daily-temperatures/description/
 */
public class DailyTemeratures {

    public int[] dailyTemperatures(int[] temperatures) {
        if(temperatures == null) {
            return null;
        }
        Stack<Integer> stack = new Stack<>();
        int[] rs = new int[temperatures.length];
        for (int i = temperatures.length - 1; i >= 0; i--) {
            while(!stack.isEmpty() && temperatures[i] >= temperatures[stack.peek()]) {
                stack.pop();
            }
            rs[i] = stack.isEmpty() ? 0 : stack.peek() - i;
            stack.push(i);
        }
        return rs;
    }

}
