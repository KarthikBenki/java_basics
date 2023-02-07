package dsa.linkedlist;

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

    }

    private static void printLinkedList(Node<Integer> linkedList) {
        while (linkedList.next != null) {
            System.out.print(linkedList.data + " ");
            linkedList = linkedList.next;
        }
        System.out.println(linkedList.data);
    }
}
