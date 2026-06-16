package Trees;

public class BSTDemo {

    public static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    // Insert
    public static TreeNode insert(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        if (val < root.val) {
            root.left = insert(root.left, val);
        } else if (val > root.val) {
            root.right = insert(root.right, val);
        }
        return root;
    }

    // Delete
    public static TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) return null;

        if (key < root.val) {
            root.left = deleteNode(root.left, key);
        } else if (key > root.val) {
            root.right = deleteNode(root.right, key);
        } else {
            // Found node to delete
            // Case 1 & 2: 1 child or 0 child
            if (root.left == null) return root.right;
            if (root.right == null) return root.left;

            // Case 3: 2 children. Find inorder successor (smallest in right subtree)
            root.val = getMin(root.right);
            // Delete successor
            root.right = deleteNode(root.right, root.val);
        }
        return root;
    }

    private static int getMin(TreeNode root) {
        int minVal = root.val;
        while (root.left != null) {
            minVal = root.left.val;
            root = root.left;
        }
        return minVal;
    }

    // Search
    public static boolean search(TreeNode root, int val) {
        if (root == null) return false;
        if (root.val == val) return true;
        return val < root.val ? search(root.left, val) : search(root.right, val);
    }

    // BST Validation
    public static boolean isValidBST(TreeNode root) {
        return validate(root, null, null);
    }

    private static boolean validate(TreeNode node, Integer min, Integer max) {
        if (node == null) return true;
        if ((min != null && node.val <= min) || (max != null && node.val >= max)) {
            return false;
        }
        return validate(node.left, min, node.val) && validate(node.right, node.val, max);
    }

    // Kth Smallest Element
    private static int count = 0;
    private static int result = -1;

    public static int kthSmallest(TreeNode root, int k) {
        count = 0;
        result = -1;
        inorderHelper(root, k);
        return result;
    }

    private static void inorderHelper(TreeNode root, int k) {
        if (root == null || result != -1) return;
        inorderHelper(root.left, k);
        count++;
        if (count == k) {
            result = root.val;
            return;
        }
        inorderHelper(root.right, k);
    }

    public static void printInorder(TreeNode root) {
        if (root != null) {
            printInorder(root.left);
            System.out.print(root.val + " ");
            printInorder(root.right);
        }
    }

    public static void main(String[] args) {
        TreeNode root = null;
        root = insert(root, 50);
        insert(root, 30);
        insert(root, 70);
        insert(root, 20);
        insert(root, 40);
        insert(root, 60);
        insert(root, 80);

        System.out.print("Inorder traversal of BST: ");
        printInorder(root); // Sorted order: 20 30 40 50 60 70 80
        System.out.println();

        System.out.println("Is Valid BST: " + isValidBST(root)); // true
        System.out.println("Search(40): " + search(root, 40)); // true

        System.out.println("Kth Smallest (k=3): " + kthSmallest(root, 3)); // 40

        System.out.println("\n[Action] Deleting node 30 (has 2 children)...");
        root = deleteNode(root, 30);
        System.out.print("Inorder after deletion: ");
        printInorder(root); // 20 40 50 60 70 80
        System.out.println();
    }
}
