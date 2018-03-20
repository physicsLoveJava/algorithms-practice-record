package types.stack;

import java.util.Stack;

public class IsSymbolsBalanced {

    public boolean isBalanced(String symbol) {
        if(symbol == null) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < symbol.length(); i++) {
            switch (symbol.charAt(i)) {
                case '(':
                case '[':
                case '{':
                    stack.push(symbol.charAt(i));
                    break;
                case ')':
                case ']':
                case '}':
                    if (stack.isEmpty() || transform(symbol.charAt(i)) != stack.pop()) {
                        return false;
                    }
                    break;
                default:
                    break;
            }
        }
        return stack.isEmpty();
    }

    private Character transform(Character pop) {
        switch (pop) {
            case ')':
                return '(';
            case ']':
                return '[';
            case '}':
                return '{';
        }
        return 'A';
    }

}
