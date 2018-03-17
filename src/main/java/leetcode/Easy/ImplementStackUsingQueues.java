package leetcode.Easy;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Problem Url: https://leetcode.com/problems/implement-stack-using-queues
 */
public class ImplementStackUsingQueues {

    class MyStack {

        private Queue<Integer> queue = new ArrayDeque<>();
        private Queue<Integer> back = new ArrayDeque<>();

        /** Initialize your data structure here. */
        public MyStack() {

        }

        /** Push element x onto stack. */
        public void push(int x) {
            queue.offer(x);
        }

        private void load() {
            while(queue.size() > 1) {
                back.offer(queue.poll());
            }
        }

        private void unload() {
            while(!back.isEmpty()) {
                queue.offer(back.poll());
            }
        }

        /** Removes the element on top of the stack and returns that element. */
        public int pop() {
            load();
            Integer poll = queue.poll();
            unload();
            return poll;
        }

        /** Get the top element. */
        public int top() {
            load();
            Integer peek = queue.poll();
            unload();
            queue.offer(peek);
            return peek;
        }

        /** Returns whether the stack is empty. */
        public boolean empty() {
            return queue.isEmpty();
        }
    }

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */

}
