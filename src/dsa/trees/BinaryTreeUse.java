package dsa.trees;

import java.util.Scanner;

public class BinaryTreeUse {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(1);
        BinaryTreeNode<Integer> rootLeft = new BinaryTreeNode<>(2);
        BinaryTreeNode<Integer> rootRight = new BinaryTreeNode<>(3);
        root.left = rootLeft;
        root.right = rootRight;
        root.left.right = new BinaryTreeNode<>(4);
        root.right.left = new BinaryTreeNode<>(5);
        printBinaryTreeDetailed(root);
    }

    private static void printBinaryTree(BinaryTreeNode<Integer> root) {
        if (root == null) return;

        System.out.print(root.data + " ");
        printBinaryTree(root.left);
        printBinaryTree(root.right);
    }

    private static void printBinaryTreeDetailed(BinaryTreeNode<Integer> root) {
        if (root == null) return;

        System.out.print(root.data + ": ");
        if (root.left != null)
            System.out.print("L" + root.left.data + " ");
        if (root.right != null)
            System.out.print("R" + root.right.data + " ");
        System.out.println();
        printBinaryTreeDetailed(root.left);
        printBinaryTreeDetailed(root.right);
    }


    private static BinaryTreeNode<Integer> createTree() {
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        if (data == -1) return null;

        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(data);
        root.left = createTree();
        root.right = createTree();

        return root;
    }


}
