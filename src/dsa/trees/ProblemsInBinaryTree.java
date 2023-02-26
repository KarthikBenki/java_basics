package dsa.trees;

public class ProblemsInBinaryTree {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = BinaryTreeUse.createTreeBetter(true, 0, true);
        int largest = largestOfAllNodes(root);
        System.out.println(largest);
    }

    private static int largestOfAllNodes(BinaryTreeNode<Integer> root) {
        if (root == null) return -1;
        int leftLarge = largestOfAllNodes(root.left);
        int rightLarge = largestOfAllNodes(root.right);

        return Math.max(leftLarge,Math.max(rightLarge,root.data));
    }


    public static int numberOfNodesInATree(BinaryTreeNode<Integer> root) {
        if (root == null) return 0;
        int leftCount = numberOfNodesInATree(root.left);
        int rightCount = numberOfNodesInATree(root.right);
        return leftCount + rightCount + 1;
    }

    public static void printPreOrder(BinaryTreeNode<Integer> root) {
        if (root == null) return;

        System.out.print(root.data + ": ");
        if (root.left != null)
            System.out.print("L" + root.left.data + " ");
        if (root.right != null)
            System.out.print("R" + root.right.data + " ");
        System.out.println();
        printPreOrder(root.left);
        printPreOrder(root.right);
    }

    public static void printInOrder(BinaryTreeNode<Integer> root) {
        if (root == null) return;

        printPreOrder(root.left);
        System.out.print(root.data + ": ");
        if (root.left != null)
            System.out.print("L" + root.left.data + " ");
        if (root.right != null)
            System.out.print("R" + root.right.data + " ");
        System.out.println();
        printPreOrder(root.right);
    }

    public static void printPostOrder(BinaryTreeNode<Integer> root) {
        if (root == null) return;

        printPreOrder(root.left);
        printPreOrder(root.right);
        System.out.print(root.data + ": ");
        if (root.left != null)
            System.out.print("L" + root.left.data + " ");
        if (root.right != null)
            System.out.print("R" + root.right.data + " ");
        System.out.println();
    }


}
