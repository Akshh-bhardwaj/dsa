package LinkedList;

public class ReverseList {

    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node insertAtEnd(Node head, int data) {
        Node n = new Node(data);
        if (head == null) return n;
        Node temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = n;
        return head;
    }

    public static Node reverseList(Node head) {
        Node prev = null;
        Node curr = head;
        Node next = null;

        while (curr != null) {
            next = curr.next; /* Save next */
            curr.next = prev; /* Reverse the link */
            prev = curr;       /* Move prev forward */
            curr = next;       /* Move curr forward */
        }
        return prev; /* New head */
    }

    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        Node head = null;
        head = insertAtEnd(head, 1);
        head = insertAtEnd(head, 2);
        head = insertAtEnd(head, 3);
        head = insertAtEnd(head, 4);
        head = insertAtEnd(head, 5);

        System.out.print("Original : ");
        printList(head);

        head = reverseList(head);

        System.out.print("Reversed : ");
        printList(head);
    }
}
