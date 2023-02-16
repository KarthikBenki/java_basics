package dsa.queue;

import dsa.linkedlist.LinkedListNode;


public class QueueUse {
    public static void main(String[] args) {
        QueueUsingLL<Integer> queue = new QueueUsingLL<>();
        int arr[] = {10, 20, 30, 40, 50, 60,70};
        for (int ele : arr) {
            queue.enqueue(ele);
        }




        while (!queue.isEmpty()) {
            try {
                int x  = queue.dequeue();
                System.out.print(x + " ");
            } catch (QueueEmptyException e) {

            }
        }
    }

    private static void printRecursive(LinkedListNode<Integer> head) {
        if (head == null) return;//base case

        System.out.print(head.data + " ");//print first data

        printRecursive(head.next);//call recursion

    }
}
