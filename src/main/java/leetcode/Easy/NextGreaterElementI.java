package leetcode.Easy;

import java.util.Arrays;
import java.util.Stack;

/**
 * Problem Url: https://leetcode.com/problems/next-greater-element-i
 */
public class NextGreaterElementI {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        if(nums1 == null) {
            return null;
        }
        if(nums2 == null) {
            int[] ints = new int[nums1.length];
            Arrays.fill(ints, -1);
            return ints;
        }

        Stack<Integer> s1 = toStack(nums1);
        Stack<Integer> s2 = toStack(nums2);
        Stack<Integer> s3 = new Stack<>();
        while(!s1.isEmpty()) {
            Integer top = s1.pop();
            s3.push(nextGreater(s2, top));
        }
        return toArray(s3);
    }

    private Integer nextGreater(Stack<Integer> s2, Integer top) {
        Stack<Integer> back = new Stack<>();
        Integer find = null;
        Integer greater = null;
        while(!s2.isEmpty() && greater == null) {
            Integer right = s2.pop();
            if(right.equals(top)) {
                find = right;
            }
            if(right > top && find != null) {
                greater = right;
            }
            back.push(right);
        }
        while(!back.isEmpty()) {
            s2.push(back.pop());
        }
        return greater == null ? -1 : greater;
    }

    private int[] toArray(Stack<Integer> s3) {
        int[] rs = new int[s3.size()];
        int i = s3.size() - 1;
        while(!s3.isEmpty()) {
            rs[i--] = s3.pop();
        }
        return rs;
    }

    private Stack<Integer> toStack(int[] nums1) {
        Stack<Integer> stack = new Stack<>();
        for (int i = nums1.length - 1; i >= 0; i--) {
            stack.push(nums1[i]);
        }
        return stack;
    }

}
