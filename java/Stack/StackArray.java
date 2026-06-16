package Stack;

public class StackArray {
    private static final int MAX = 100;

    private static class Stack {
        int[] arr = new int[MAX];
        int top = -1;

        boolean isEmpty() { return top == -1; }
        boolean isFull() { return top == MAX - 1; }

        void push(int data) {
            if (isFull()) { System.out.println("Stack Overflow!"); return; }
            arr[++top] = data;
            System.out.println("Pushed: " + data);
        }

        int pop() {
            if (isEmpty()) { System.out.println("Stack Underflow!"); return -1; }
            return arr[top--];
        }

        int peek() {
            if (isEmpty()) { System.out.println("Stack is empty!"); return -1; }
            return arr[top];
        }

        void printStack() {
            if (isEmpty()) { System.out.println("Stack is empty"); return; }
            System.out.print("Stack (top -> bottom): ");
            for (int i = top; i >= 0; i--) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    /* ---- Valid Parentheses using Stack ---- */
    public static boolean isValidParentheses(String str) {
        Stack s = new Stack();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                s.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (s.isEmpty()) return false;
                char topVal = (char) s.pop();
                if ((c == ')' && topVal != '(') ||
                    (c == '}' && topVal != '{') ||
                    (c == ']' && topVal != '[')) return false;
            }
        }
        return s.isEmpty();
    }

    public static void main(String[] args) {
        Stack s = new Stack();

        s.push(10);
        s.push(20);
        s.push(30);
        s.printStack();
        System.out.println("Top element : " + s.peek());
        System.out.println("Popped      : " + s.pop());
        s.printStack();

        System.out.println("\n--- Valid Parentheses ---");
        String[] tests = {"(())", "()[]{}", "(]", "([)]", "{[]}"};
        for (int i = 0; i < tests.length; i++) {
            System.out.println("\"" + tests[i] + "\" => " +
                               (isValidParentheses(tests[i]) ? "Valid ✓" : "Invalid ✗"));
        }
    }
}
