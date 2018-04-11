package leetcode.Medium;

import java.util.Stack;

/**
 * Problem Url: https://leetcode.com/problems/next-greater-element-ii
 */
public class NextGreaterElementIi {

    public int[] nextGreaterElements(int[] nums) {
        int[] rs = new int[nums.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = nums.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && nums[stack.peek()] <= nums[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                rs[i] = -1;
            } else {
                rs[i] = nums[stack.peek()];
            }
            stack.push(i);
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            if (stack.isEmpty()) {
                break;
            }
            while (!stack.isEmpty() && nums[stack.peek()] <= nums[i]) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                rs[i] = nums[stack.peek()];
                stack.push(i);
            }
        }
        return rs;
    }
}
