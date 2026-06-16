package Stack;

public class StackUsingArray {
    private static final int MAX = 100;
    private int[] stack = new int[MAX];
    private int top = -1;

    public void push(int val) {
        if (top == MAX - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        stack[++top] = val;
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return stack[top--];
    }

    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }
        for (int i = top; i >= 0; i--) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        StackUsingArray s = new StackUsingArray();
        s.push(10);
        s.push(20);
        s.push(30);
        s.display(); // 30 20 10
        System.out.println("Popped: " + s.pop());
        s.display(); // 20 10
    }
}
