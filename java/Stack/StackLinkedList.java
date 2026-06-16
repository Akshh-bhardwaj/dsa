package Stack;

public class StackLinkedList {

    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node top = null;

    public void push(int x) {
        Node newNode = new Node(x);
        newNode.next = top;
        top = newNode;
        System.out.println(x + " pushed to stack");
    }

    public int pop() {
        if (top == null) {
            System.out.println("Stack Underflow");
            return -1;
        }
        int x = top.data;
        top = top.next;
        return x;
    }

    public int peek() {
        if (top == null) {
            return -1;
        }
        return top.data;
    }

    public void display() {
        Node temp = top;
        System.out.print("Stack: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        StackLinkedList s = new StackLinkedList();
        s.push(10);
        s.push(20);
        s.push(30);
        s.display();                               // 30 20 10
        System.out.println("Top element is " + s.peek());   // 30
        System.out.println("Popped element is " + s.pop()); // 30
        s.display();                               // 20 10
    }
}
