package dsa.trees;

import com.sun.source.tree.BreakTree;

public class ProblemsInBinaryTree {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = BinaryTreeUse.createTreeBetter(true, 0, true);
        boolean balanced = isBalanced(root);
        if (balanced) System.out.println("balanced");
        else System.out.println("not balanced");
    }

    public static boolean isBalanced(BinaryTreeNode<Integer> root) {
        if (root == null) return true;

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        if (Math.abs(leftHeight - rightHeight) > 1) {
            return false;
        }

        boolean isLeftBalanced = isBalanced(root.left);
        boolean isRightBalanced = isBalanced(root.right);

        return isLeftBalanced && isRightBalanced;


    }

    private static int height(BinaryTreeNode<Integer> root) {
        if (root == null) return 0;

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        return leftHeight + rightHeight + 1;
    }

    private static void printNodesAtDepthK(BinaryTreeNode<Integer> root, int k) {
        if (root == null) return;
        if (k == 0) System.out.println(root.data);
        printNodesAtDepthK(root.left, k - 1);
        printNodesAtDepthK(root.right, k - 1);
    }

    private static int numberOfLeafNodes(BinaryTreeNode<Integer> root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) return 1;

        var left = numberOfLeafNodes(root.left);
        var right = numberOfLeafNodes(root.right);

        return left + right;
    }

    private static int heightOfTree(BinaryTreeNode<Integer> root) {
        if (root == null) return 0;
        int leftHeight = heightOfTree(root.left);
        int rightHeight = heightOfTree(root.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    private static int largestOfAllNodes(BinaryTreeNode<Integer> root) {
        if (root == null) return -1;
        int leftLarge = largestOfAllNodes(root.left);
        int rightLarge = largestOfAllNodes(root.right);

        return Math.max(leftLarge, Math.max(rightLarge, root.data));
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

    public static BinaryTreeNode<Integer> removeLeafNodeOfTree(BinaryTreeNode<Integer> root) {

        if (root == null) return null;

        if (root.left == null && root.right == null) {
            return null;
        }

        root.left = removeLeafNodeOfTree(root.left);
        root.right = removeLeafNodeOfTree(root.right);

        return root;

    }


}
