package dsa.stack.collections;

import java.util.Stack;

public class StackUse {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        System.out.println(stack.size());

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
//        System.out.println(stack.size());
//         stack.push(10);
//        System.out.println(stack.peek());
//        System.out.println(stack.size());
//        stack.pop();
//
//        System.out.println(stack.size());
//        System.out.println(stack.isEmpty());
//        stack.push(10);
//        stack.add(20);
//        stack.add(20);
//        stack.add(20);
//        stack.add(20);

        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }



    }
}
