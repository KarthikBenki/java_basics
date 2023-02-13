package dsa.stack;

public class StackUsingArray {

    private int data[];
    private int stackIndex;

    public StackUsingArray() {
        this.data = new int[10];
        this.stackIndex = -1;
    }

    public void push(int data) {
        stackIndex++;
        if (stackIndex>=this.data.length){
            int temp[] = this.data;
            this.data = new int[temp.length*2];
            for (int i = 0; i < temp.length; i++) {
                this.data[i] = temp[i];
            }
         }
        this.data[stackIndex] = data;
    }

    public void pop() {
        if (stackIndex > -1) {
            this.data[stackIndex] = 0;
            stackIndex--;
        } else
            throw new RuntimeException("No element present in stack to pop");
    }

    public int top() {
        if (stackIndex > -1)
            return this.data[stackIndex];
        return -1;
    }

    public boolean isEmpty() {
        return stackIndex == -1;
    }

    public int size() {
        return stackIndex + 1;
    }
}
