package dsa.queue;

public class QueueUsingArray {
    private int data[];
    private int front;
    private int rear;
    private int size;

    public QueueUsingArray() {
        data = new int[5];
        front = -1;
        rear = -1;
        size = 0;
    }

    public QueueUsingArray(int initializeSize) {
        data = new int[initializeSize];
        front = -1;
        rear = -1;
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public int front() throws QueueEmptyException {
        if (size == 0) throw new QueueEmptyException();
        return data[front];
    }

    public void enqueue(int ele) throws QueueFullException {
        if (size == data.length) {
            doubleCapacity();
        }
        if (size == 0) front = 0;//if size is zero assigining front to zero
//        rear++;
//        if (rear == data.length) rear = 0;//logic for circular queue
        rear = (rear + 1) % data.length;
        data[rear] = ele;
        size++;
    }

    private void doubleCapacity() {
        int temp[] = data;
        data = new int[temp.length*2];
        int index = 0;
        for (int i = front; i < temp.length; i++) {
            data[index++] = temp[i];
        }

        for (int i = 0; i < rear; i++) {
            data[index++] = temp[i];
        }
    }

    public int dequeue() throws QueueEmptyException {
        if (size == 0) {
            throw new QueueEmptyException();
        }
        int temp = data[front];
//        front++;
//        if (front == data.length) {//after deleting the last element if size is still 1
//            //so need to make the front to zero {circular queue logic}
//            front = 0;
//        }
        front = (front+1) % data.length;//the values less than data.length will be same as values
        //the value same as data.length will be zero as x%x ==0
        size--;
        if (size == 0) {//dequeing the last element so that size becomes zero then no elements
            //in the queue make front and rear to -1;
            front = -1;
            rear = -1;
        }
        return temp;
    }


}
