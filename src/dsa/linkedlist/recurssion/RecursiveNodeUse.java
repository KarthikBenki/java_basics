package dsa.linkedlist.recurssion;

import dsa.linkedlist.LinkedListNode;
import dsa.linkedlist.NodeUse;

import java.util.Scanner;

public class RecursiveNodeUse {

    public static void main(String[] args) {
        LinkedListNode<Integer> head = NodeUse.takeInput1();
        Scanner scanner = new Scanner(System.in);
        head = insertNode(head, 5, 20);
        printRecursive(head);
        System.out.println();
//        printReverseRecursive(head);
    }

    private static LinkedListNode<Integer> insertNode(LinkedListNode<Integer> head, int pos, int data) {

//        if (pos>NodeUse.length(head)) return null;

        if (head == null && pos > 0) return null;

        if (pos == 0) {
            LinkedListNode<Integer> newNode = new LinkedListNode<>(data);
            newNode.next = head;
            head = newNode;
            return head;
        }
        LinkedListNode<Integer> newHead = insertNode(head.next, pos - 1, data);

        head.next = newHead;
        return head;
    }


    private static void printReverseRecursive(LinkedListNode<Integer> head) {
        if (head == null) return;//base case

        printReverseRecursive(head.next);//call recursion

        System.out.print(head.data + " ");//print first data

    }

    private static void printRecursive(LinkedListNode<Integer> head) {
        if (head == null) return;//base case

        System.out.print(head.data + " ");//print first data

        printRecursive(head.next);//call recursion

    }


}
