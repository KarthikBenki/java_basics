package dsa.stack.collections;

import java.util.Stack;

public class RedundantBrackets {
    public static void main(String[] args) {
        String expression = "a+(b)+c";
        boolean b = checkRedundantBrackets(expression);
        System.out.println(b);
    }

    public static boolean checkRedundantBrackets(String expression) {
        if (expression.isEmpty()) return false;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            if (ch != ')') {
                stack.push(ch);
                continue;
            }
            int count = 0;
            while (stack.pop() != '(') {
                count++;
            }

            if (count == 0|| count == 1) return true;
        }

        return false;

    }

}
