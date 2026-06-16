package LinkedList;

public class InsertionInLinkedList {

    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Allocate memory and assign data (mimicking malloc in C)
        Node first = new Node(100);
        Node second = new Node(200);
        Node third = new Node(300);
        Node forth = new Node(463);
        Node newnode = new Node(45);

        // Connect nodes in the specific sequence from the C program
        first.next = third;
        third.next = second;
        second.next = newnode;
        newnode.next = forth;
        forth.next = null;

        Node head = first;

        System.out.println("Before insertion:");
        printList(head);

        // Insert 454 after 200
        Node temp = head;
        while (temp != null && temp.data != 200) {
            temp = temp.next;
        }

        if (temp != null) {
            Node insertNode = new Node(454);
            insertNode.next = temp.next;
            temp.next = insertNode;
        }

        System.out.println("After inserting 454 after 200:");
        printList(head);
    }
}
