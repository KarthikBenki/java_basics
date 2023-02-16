package dsa.queue;

import dsa.linkedlist.Node;

public class Queue {

    //Define the data members
    private Node front;
    private Node rear;
    private int size;


    public Queue() {
        front = null;
        rear = null;
        size = 0;
    }



    /*----------------- Public Functions of Stack -----------------*/


    public int getSize() {
        //Implement the getSize() function
        return  size;
    }


    public boolean isEmpty() {
        //Implement the isEmpty() function
        return  size == 0;
    }


    public void enqueue(int data) {
        //Implement the enqueue(element) function
        if (size == 0){
            Node newNode = new Node(data);
            front = newNode;
            rear = newNode;
        }else {
            Node newNode = new Node(data);
            rear.next = newNode;
            rear = newNode;
        }
    }


    public int dequeue() {
        //Implement the dequeue() function
        if (size == 0) return  -1;
        int temp = front.data;
        front = front.next;
        return  temp;
    }


    public int front() {
        if (size == 0) return -1;
        //Implement the front() function
        return front.data;
    }

    public int rear(){
        if (size == 0) return -1;
        return rear.data;
    }
}

