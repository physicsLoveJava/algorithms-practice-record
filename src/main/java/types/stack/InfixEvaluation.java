package types.stack;

import java.util.Stack;

public class InfixEvaluation {

    public Integer eval(String exp) {
        Stack<Integer> numsStack = new Stack<>();
        Stack<Character> opStack = new Stack<>();
        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            if(Character.isDigit(ch)) {
                numsStack.push(Character.digit(ch, 10));
            }else {
                if(!opStack.isEmpty()) {
                    Character prevOp = opStack.peek();
                    if(prevOp == '*' || prevOp == '/') {
                        Integer op1 = numsStack.pop();
                        Integer op2 = numsStack.pop();
                        numsStack.push(operation(prevOp, op2, op1));
                        opStack.pop();
                    }
                }
                opStack.push(ch);
            }
        }
        while(!opStack.isEmpty()) {
            Integer op1 = numsStack.pop();
            Integer op2 = numsStack.pop();
            numsStack.push(operation(opStack.pop(), op2, op1));
        }
        return numsStack.pop();
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
