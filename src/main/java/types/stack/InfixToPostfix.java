package types.stack;

import java.util.Stack;

public class InfixToPostfix {

    public String infixToPostfix(String exp) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            switch (ch) {
                case '+':
                case '-':
                    if(!stack.isEmpty()) {
                        if(stack.peek() != '(') {
                            sb.append(stack.pop());
                        }
                    }
                    stack.push(ch);
                    break;
                case '*':
                case '/':
                case '(':
                    stack.push(ch);
                    break;
                case ' ':
                    break;
                case ')':
                    boolean hasPair = false;
                    while(!stack.isEmpty()) {
                        if (stack.peek() != '(') {
                            sb.append(stack.pop());
                        }else {
                            stack.pop();
                            hasPair = true;
                            break;
                        }
                    }
                    if(!hasPair) {
                        throw new IllegalArgumentException("不正确的表达式");
                    }
                    break;
                default:
                    sb.append(ch);
                    break;
            }
        }
        while(!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.toString();
    }

}
