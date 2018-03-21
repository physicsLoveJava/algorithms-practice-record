package types.stack;

import java.util.Stack;

public class PostfixEvaluation {

    public Integer eval(String exp) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            if(Character.isDigit(ch)) {
                stack.push(Character.digit(ch, 10));
            }else {
                Integer op1 = stack.pop();
                Integer op2 = stack.pop();
                stack.push(operation(ch, op2, op1));
            }
        }
        return stack.pop();
    }

    private Integer operation(char ch, Integer op2, Integer op1) {
        switch (ch) {
            case '+':
                return op2 + op1;
            case '-':
                return op2 - op1;
            case '*':
                return op2 * op1;
            case '/':
                return op2 / op1;
        }
        return null;
    }

}
