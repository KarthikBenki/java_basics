package dsa.linkedlist;

import java.util.Scanner;

public class NodeUse {
    public static Node<Integer> createLinkedList() {
        Node<Integer> n1 = new Node<>(10);
        Node<Integer> n2 = new Node<>(20);
        Node<Integer> n3 = new Node<>(30);
        Node<Integer> n4 = new Node<>(40);
        n1.add(n2);
        n2.add(n3);
        n3.add(n4);

        return n1;
    }

    public static void main(String[] args) {

        Node<Integer> head = createLinkedList();
        printLinkedList(head);
        Node<Integer> newNode = new Node<>(50);
        head = insert(head, newNode, 1);
        printLinkedList(head);


    }

    public static Node<Integer> insert(Node<Integer> head, Node<Integer> newNode, int pos) {
        if (pos >= length(head)) return head;

        if (pos == 0) {
            newNode.next = head;
            head = newNode;
            return head;
        }

        int index = 0;
        Node<Integer> temp = head;

        while (index != pos - 1) {
            temp = temp.next;
            index++;
        }
        newNode.next = temp.next;
        temp.next = newNode;

        return head;
    }

    private static void increment(Node<Integer> head) {
        Node<Integer> temp = head;
        while (temp != null) {
            temp.data++;
            temp = temp.next;
        }
    }

    public static Node<Integer> takeInput() {
        Scanner scanner = new Scanner(System.in);
        int data = scanner.nextInt();
        Node<Integer> head = null;
        while (data != -1) {
            Node<Integer> currentNode = new Node<>(data);
            if (head == null) head = currentNode;
            else {
                Node<Integer> temp = head;
                while (temp.next != null) temp = temp.next;
                temp.next = currentNode;
            }
            data = scanner.nextInt();
        }
        return head;
    }


    public static Node<Integer> takeInput1() {
        Node<Integer> head = null;
        Scanner scanner = new Scanner(System.in);
        int data = scanner.nextInt();
        if (data == -1) return head;
        head = new Node<>(data);
        Node<Integer> temp = head;
        data = scanner.nextInt();
        while (data != -1) {
            Node<Integer> newNode = new Node<>(data);
            temp.next = newNode;
            temp = temp.next;
            data = scanner.nextInt();
        }
        return head;
    }

    public static int length(Node<Integer> head) {
        Node<Integer> temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    private static void printLinkedList(Node<Integer> linkedList) {
        Node<Integer> temp = linkedList;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
