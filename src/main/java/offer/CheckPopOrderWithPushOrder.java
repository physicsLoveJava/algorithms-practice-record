package offer;

import java.util.Stack;

public class CheckPopOrderWithPushOrder {

    public static boolean isPossible(int[] pushOrder, int[] popOrder) {

        if(pushOrder == null || popOrder == null) {
            return false;
        }

        Stack<Integer> stack = new Stack<>();

        int pushIdx = 0;
        boolean match = false;
        for (int i = 0; i < popOrder.length; i++) {
            int cur = popOrder[i];
            if(checkTop(stack, cur)) {
                stack.pop();
                continue;
            }
            while(pushIdx < pushOrder.length && !match) {
                stack.push(pushOrder[pushIdx++]);
                match = stack.peek().equals(cur);
            }
            if(match) {
                stack.pop();
                match = false;
            }else {
                return false;
            }
        }

        return true;
    }

    private static boolean checkTop(Stack<Integer> stack, int cur) {
        if(stack.isEmpty()) {
            return false;
        }
        return stack.peek().equals(cur);
    }

}
