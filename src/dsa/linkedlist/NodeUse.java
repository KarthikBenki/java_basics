package dsa.linkedlist;

import java.util.Scanner;

public class NodeUse {
    public static LinkedListNode<Integer> createLinkedList() {
        LinkedListNode<Integer> n1 = new LinkedListNode<>(10);
        LinkedListNode<Integer> n2 = new LinkedListNode<>(20);
        LinkedListNode<Integer> n3 = new LinkedListNode<>(30);
        LinkedListNode<Integer> n4 = new LinkedListNode<>(40);
        n1.add(n2);
        n2.add(n3);
        n3.add(n4);

        return n1;
    }

    public static void main(String[] args) {

        LinkedListNode<Integer> head = takeInput1();
        printLinkedList(head);

        head = appendLastNToFirst(head, 3);
        printLinkedList(head);


    }

    public static LinkedListNode<Integer> appendLastNToFirst(LinkedListNode<Integer> head, int n) {
        //12345
        //3
        //34512

        if (head == null || n == 0) return head;

        int count = 0;

        while (count < n) {

            LinkedListNode<Integer> temp = head;

            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next.next = head;
            head = temp.next;
            temp.next = null;

            count++;
        }

        return head;
    }

    public static int findNode(LinkedListNode<Integer> head, int n) {

        if (head == null) return -1;

        if (head.data == n) {
            return 0;
        }

        int index = 0;
        LinkedListNode<Integer> temp = head.next;

        while (temp != null) {
            index++;
            if (temp.data == n) {
                return index;
            }
            temp = temp.next;
        }

        return -1;

    }


    public static LinkedListNode<Integer> deleteNode(LinkedListNode<Integer> head, int pos) {

        if (pos == 0) {
            head = head.next;
            return head;
        }
        if (pos >= length(head)) return head;//check for last element index and the elements after the last elements

        int index = 0;
        LinkedListNode<Integer> temp = head;
        while (pos > 0 && index != pos - 1) {
            temp = temp.next;
            index++;
        }
        temp.next = temp.next.next;
        return head;
    }

    public static LinkedListNode<Integer> insert(LinkedListNode<Integer> head, LinkedListNode<Integer> newNode, int pos) {
        if (pos >= length(head)) return head;

        if (pos == 0) {
            newNode.next = head;
            head = newNode;
            return head;
        }

        int index = 0;
        LinkedListNode<Integer> temp = head;

        while (index != pos - 1) {
            temp = temp.next;
            index++;
        }
        newNode.next = temp.next;
        temp.next = newNode;

        return head;
    }

    private static void increment(LinkedListNode<Integer> head) {
        LinkedListNode<Integer> temp = head;
        while (temp != null) {
            temp.data++;
            temp = temp.next;
        }
    }

    public static LinkedListNode<Integer> takeInput() {
        Scanner scanner = new Scanner(System.in);
        int data = scanner.nextInt();
        LinkedListNode<Integer> head = null;
        while (data != -1) {
            LinkedListNode<Integer> currentNode = new LinkedListNode<>(data);
            if (head == null) head = currentNode;
            else {
                LinkedListNode<Integer> temp = head;
                while (temp.next != null) temp = temp.next;
                temp.next = currentNode;
            }
            data = scanner.nextInt();
        }
        return head;
    }


    public static LinkedListNode<Integer> takeInput1() {
        LinkedListNode<Integer> head = null;
        Scanner scanner = new Scanner(System.in);
        int data = scanner.nextInt();
        if (data == -1) return head;
        head = new LinkedListNode<>(data);
        LinkedListNode<Integer> temp = head;
        data = scanner.nextInt();
        while (data != -1) {
            LinkedListNode<Integer> newNode = new LinkedListNode<>(data);
            temp.next = newNode;
            temp = temp.next;
            data = scanner.nextInt();
        }
        return head;
    }

    public static int length(LinkedListNode<Integer> head) {
        LinkedListNode<Integer> temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    private static void printLinkedList(LinkedListNode<Integer> linkedList) {
        LinkedListNode<Integer> temp = linkedList;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
