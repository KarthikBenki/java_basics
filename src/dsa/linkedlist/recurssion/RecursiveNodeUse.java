package dsa.linkedlist.recurssion;

import dsa.linkedlist.LinkedListNode;
import dsa.linkedlist.NodeUse;

import java.util.Scanner;

public class RecursiveNodeUse {

    public static void main(String[] args) {
        LinkedListNode<Integer> head = NodeUse.takeInput1();
        head = reverseLinkedListRec1(head);
        printRecursive(head);
        System.out.println();
//        printReverseRecursive(head);
    }

    public static LinkedListNode<Integer> reverseLinkedListRec(LinkedListNode<Integer> head) {
        if (head == null || head.next == null) {
            return head;
        }

        LinkedListNode<Integer> newNode = reverseLinkedListRec(head.next);
        head.next.next = head;
        head.next = null;
        return newNode;

    }

    public static LinkedListNode<Integer> reverseLinkedListRec1(LinkedListNode<Integer> head) {
        if (head == null || head.next == null) {
            return head;
        }

        LinkedListNode<Integer> newNode = reverseLinkedListRec1(head.next);
        LinkedListNode<Integer> tail = newNode;
        while (tail.next != null) {
            tail = tail.next;
        }
        tail.next = head;
        head.next = null;
        return newNode;
    }

    public static LinkedListNode<Integer> deleteNodeRec(LinkedListNode<Integer> head, int pos) {

        if (head == null && pos == 0) return null;
        if (pos == 0) {
            return head.next;
        }

        if (head != null)
            head.next = deleteNodeRec(head.next, pos - 1);

        return head;
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
