package dsa.queue;


import dsa.linkedlist.LinkedListNode;


public class QueueUsingLL<T> {
    private LinkedListNode<T> front;
    private LinkedListNode<T> rear;
    private int size;

    public QueueUsingLL() {
        front = null;
        rear = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(T ele){
        if (size == 0){
            front = new LinkedListNode<>(ele);
            rear = front;
        }else {
            LinkedListNode<T> next = new LinkedListNode<>(ele);
            rear.next = next;
            rear = next;
        }
        size++;
    }

    public T front(){
        return front.data;
    }

    public T dequeue() throws QueueEmptyException {
        if (size==0) throw new QueueEmptyException();
        T temp = front.data;
        front = front.next;
        size--;
        return temp;
    }

    public LinkedListNode<T> getFront(){
        return front;
    }


}
