package leetcode.Easy;

import java.util.Stack;

/**
 * Problem Url: https://leetcode.com/problems/implement-queue-using-stacks
 */
public class ImplementQueueUsingStacks {

    public static class MyQueue{
        private Stack<Integer> stack = new Stack<>();
        private Stack<Integer> back = new Stack<>();
        /** Initialize your data structure here. */
        public MyQueue() {

        }

        private void load() {
            while(!stack.isEmpty()) {
                back.push(stack.pop());
            }
        }

        private void unload() {
            while(!back.isEmpty()) {
                stack.push(back.pop());
            }
        }

        /** Push element x to the back of queue. */
        public void push(int x) {
            load();
            stack.push(x);
            unload();
        }

        /** Removes the element from in front of queue and returns that element. */
        public int pop() {
            return stack.pop();
        }

        /** Get the front element. */
        public int peek() {
            return stack.peek();
        }

        /** Returns whether the queue is empty. */
        public boolean empty() {
            return stack.isEmpty();
        }

        /**
         * Your MyQueue object will be instantiated and called as such:
         * MyQueue obj = new MyQueue();
         * obj.push(x);
         * int param_2 = obj.pop();
         * int param_3 = obj.peek();
         * boolean param_4 = obj.empty();
         */
    }

}
