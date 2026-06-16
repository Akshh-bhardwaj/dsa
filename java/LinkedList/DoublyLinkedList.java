package LinkedList;

import java.util.Scanner;

public class DoublyLinkedList {

    // Define a node in the BST
    private static class Node {
        int data;
        Node left, right;

        Node(int value) {
            this.data = value;
            this.left = null;
            this.right = null;
        }
    }

    private static Node insert(Node root, int value) {
        if (root == null) {
            return new Node(value);
        }

        if (value < root.data) {
            root.left = insert(root.left, value);
        } else if (value > root.data) {
            root.right = insert(root.right, value);
        }

        return root;
    }

    private static void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    private static void preorder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    private static void postorder(Node root) {
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }
    }

    private static Node search(Node root, int key) {
        if (root == null || root.data == key) {
            return root;
        }

        if (key < root.data) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
    }

    public static void main(String[] args) {
        Node root = null;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- BST Menu ---");
            System.out.println("1. Insert");
            System.out.println("2. Inorder Traversal");
            System.out.println("3. Preorder Traversal");
            System.out.println("4. Postorder Traversal");
            System.out.println("5. Search");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            
            if (!scanner.hasNextInt()) {
                break;
            }
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert: ");
                    if (scanner.hasNextInt()) {
                        int value = scanner.nextInt();
                        root = insert(root, value);
                    }
                    break;
                case 2:
                    System.out.print("Inorder: ");
                    inorder(root);
                    System.out.println();
                    break;
                case 3:
                    System.out.print("Preorder: ");
                    preorder(root);
                    System.out.println();
                    break;
                case 4:
                    System.out.print("Postorder: ");
                    postorder(root);
                    System.out.println();
                    break;
                case 5:
                    System.out.print("Enter value to search: ");
                    if (scanner.hasNextInt()) {
                        int value = scanner.nextInt();
                        if (search(root, value) != null) {
                            System.out.println("Value found in BST.");
                        } else {
                            System.out.println("Value not found.");
                        }
                    }
                    break;
                case 6:
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice.");
            }
        }
        scanner.close();
    }
}
