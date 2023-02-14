package dsa.stack.linkedlist;

public class StackUsingLLUse {
    public static void main(String[] args) {
        StackUsingLinkedList<Integer> stack = new StackUsingLinkedList<>();
        System.out.println("size before adding element "+stack.size());
        stack.push(10);
        Integer top = stack.top();
        System.out.println("top element is "+top);
        System.out.println("size after adding element "+stack.size());
        Integer pop = stack.pop();
        System.out.println("popped element "+pop);
        System.out.println("size after popping element "+stack.size());
    }
}
