package dsa.stack;

public class StackUse {
    public static void main(String[] args) throws StackFullException, StackEmptyException {
        StackUsingArray stack = new StackUsingArray();
//        stack.push(10);
//        stack.push(20);
//        stack.push(20);
//        stack.push(20);
//        stack.push(20);
//        stack.push(20);
//        stack.push(20);
//        stack.push(20);
//        stack.push(20);
//        stack.push(30);

//        stack.pop();
        int top = stack.top();
        System.out.println("top "+top);
        boolean empty = stack.isEmpty();
        System.out.println("isEmpty "+empty);
        int size = stack.size();
        System.out.println("size "+size);
    }
}
