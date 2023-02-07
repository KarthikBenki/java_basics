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
        increment(head);
        printLinkedList(head);

    }

    private static void increment(Node<Integer> head) {
        Node<Integer> temp = head;
        while(temp!=null){
            temp.data++;
            temp=temp.next;
        }
    }

    private static void printLinkedList(Node<Integer> linkedList) {
        Node<Integer> temp = linkedList;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
}
