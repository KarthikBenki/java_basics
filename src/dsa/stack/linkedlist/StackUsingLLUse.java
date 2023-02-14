package dsa.stack.linkedlist;

public class StackUsingLLUse {
    public static void main(String[] args) {
        StackUsingLinkedListToLeft<Integer> stack = new StackUsingLinkedListToLeft<>();
        System.out.println("size before adding element "+stack.size());
        for (int i = 0; i < 100; i++) {
            stack.push(i+1);
        }

        while (!stack.isEmpty()){
            System.out.print(stack.pop()+" ");
        }
    }
}
