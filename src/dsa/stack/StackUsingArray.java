package dsa.stack;

public class StackUsingArray {

    private int data[];
    private int topIndex;

    public StackUsingArray() {
        this.data = new int[10];
        this.topIndex = -1;
    }

    public StackUsingArray(int size) {
        this.data = new int[size];
        this.topIndex = -1;
    }

    public void push(int data) throws StackFullException {
        topIndex++;
        if (topIndex>=this.data.length){
            doubleCapacity();
        }
//        if (topIndex >= this.data.length) {
//            throw new StackFullException("StackUsing array is full");
//        }
        this.data[topIndex] = data;
    }

    private void doubleCapacity() {
        System.out.println("Double the capacity");
        int temp[] = this.data;
        this.data = new int[temp.length*2];
        for (int i = 0; i < temp.length; i++) {
            this.data[i] = temp[i];
        }
    }

    public int pop() throws StackEmptyException {
        if (topIndex > -1) {
         return  this.data[topIndex--];
        } else
            throw new StackEmptyException("Stack is empty to pop");
    }

    public int top() throws StackEmptyException {
        if (topIndex > -1)
            return this.data[topIndex];
        throw new StackEmptyException("StackUsingArray is Empty");
    }

    public boolean isEmpty() {
        return topIndex == -1;
    }

    public int size() {
        return topIndex + 1;
    }
}
