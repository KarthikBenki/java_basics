package dsa.stack.collections;

import java.util.Stack;

public class BalanceExpression {
    public static void main(String[] args) {
        boolean balanced = isBalanced("(()");
        System.out.println(balanced);
    }

    public static boolean isBalanced(String expression) {

        if (expression.isEmpty()) return true;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < expression.length(); i++) {
            char current = expression.charAt(i);
            if (current == '(') {
                stack.push(current);
                continue;
            }

            if (current == ')'){
                if (stack.isEmpty()) return false;
                Character peek = stack.peek();
                if(current==')' && peek == '(') stack.pop();
                else return false;

            }


        }

        return stack.isEmpty();




    }
}
