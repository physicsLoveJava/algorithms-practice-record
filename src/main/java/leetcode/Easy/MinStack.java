package leetcode.Easy;

import java.util.Stack;

/**
 * Problem Url: https://leetcode.com/problems/min-stack
 */
public class MinStack {

    private Stack<Integer> stack = new Stack<>();
    private Stack<Integer> min = new Stack<>();

        /** initialize your data structure here. */
        public MinStack() {

        }

        public void push(int x) {
            stack.push(x);
            if(min.isEmpty()) {
                min.push(x);
            }else {
                Integer top = min.peek();
                if(top >= x) {
                    min.push(x);
                }
            }
        }

        public void pop() {
            Integer pop = stack.pop();
            Integer min = this.min.pop();
            if(pop > min) {
                this.min.push(min);
            }
        }

        public int top() {
            return stack.peek();
        }

        public int getMin() {
            return this.min.peek();
        }

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */

}
