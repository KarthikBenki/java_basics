package dsa.stack;

public class StackUse {
    public static void main(String[] args) throws StackFullException, StackEmptyException {
        StackUsingArray stack = new StackUsingArray(100);
        int arr[] = {5,6,7,1,9};


        for (int i = 0; i < 100; i++) {
            stack.push(i+1);
        }

        while (!stack.isEmpty()){
            System.out.print(stack.pop()+" ");
        }
    }
}
