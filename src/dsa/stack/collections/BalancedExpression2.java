package dsa.stack.collections;

import java.util.Stack;

public class BalancedExpression2 {

    public static void main(String[] args) {
        boolean balanced = isBalanced("[({})]");
        System.out.println(balanced);
    }

    public static boolean isBalanced(String expression) {
        if (expression.isEmpty()) return true;

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            Character ch = expression.charAt(i);

            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
                continue;
            }

            if (ch == ')' || ch == ']' || ch == '}') {
                if (stack.isEmpty()) return false;
                Character peek = stack.peek();
                if (ch == ')' && peek == '(' || ch == ']' && peek == '[' || ch == '}' && peek == '{') {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
