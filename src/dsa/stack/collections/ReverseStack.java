package dsa.stack.collections;

import java.util.Stack;

public class ReverseStack {

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        Stack<Integer>  stack = new Stack<>();

        for (int ele:arr){
            stack.push(ele);
        }
        reverseStack(stack,new Stack<>());
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
     }
    public static void reverseStack(Stack<Integer> input, Stack<Integer> extra) {
        //Your code goes here
       if (input.isEmpty() || input.size() == 1) return;

       int temp = input.pop();

       reverseStack(input,extra);

       while (!input.isEmpty()){
           extra.push(input.pop());
       }

       extra.push(temp);

       while (!extra.isEmpty()){
           input.push(extra.pop());
       }

    }
}
