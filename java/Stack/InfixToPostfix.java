package Stack;

import java.util.Scanner;

public class InfixToPostfix {

    private static final int MAX = 100;

    private static class Stack {
        char[] data = new char[MAX];
        int top = -1;

        boolean isEmpty() {
            return top == -1;
        }

        boolean isFull() {
            return top == MAX - 1;
        }

        void push(char c) {
            if (!isFull()) {
                data[++top] = c;
            }
        }

        char pop() {
            if (!isEmpty()) {
                return data[top--];
            }
            return '\0';
        }

        char peek() {
            if (!isEmpty()) {
                return data[top];
            }
            return '\0';
        }
    }

    private static int precedence(char op) {
        switch (op) {
            case '^': return 3;
            case '*':
            case '/': return 2;
            case '+':
            case '-': return 1;
            default: return 0;
        }
    }

    private static boolean isOperator(char c) {
        return (c == '+' || c == '-' || c == '*' || c == '/' || c == '^');
    }

    public static String infixToPostfix(String infix) {
        Stack s = new Stack();
        StringBuilder postfix = new StringBuilder();

        for (int i = 0; i < infix.length(); i++) {
            char c = infix.charAt(i);

            if (Character.isWhitespace(c)) {
                continue; // skip spaces
            }

            if (Character.isLetterOrDigit(c)) { // operand
                postfix.append(c);
            } else if (c == '(') {
                s.push(c);
            } else if (c == ')') {
                while (!s.isEmpty() && s.peek() != '(') {
                    postfix.append(s.pop());
                }
                if (!s.isEmpty() && s.peek() == '(') {
                    s.pop(); // discard '('
                }
            } else if (isOperator(c)) {
                while (!s.isEmpty() && 
                      ((precedence(s.peek()) > precedence(c)) ||
                       (precedence(s.peek()) == precedence(c) && c != '^')) &&
                      s.peek() != '(') {
                    postfix.append(s.pop());
                }
                s.push(c);
            }
        }
        while (!s.isEmpty()) {
            postfix.append(s.pop());
        }
        return postfix.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter infix expression (e.g. a+b*(c^d-e)^(f+g*h)-i):");
        
        if (scanner.hasNextLine()) {
            String infix = scanner.nextLine();
            String postfix = infixToPostfix(infix);
            System.out.println("Postfix: " + postfix);
        }
        scanner.close();
    }
}
