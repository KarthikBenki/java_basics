package dsa.trees;

import java.util.Scanner;

public class BinaryTreeUse {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = createTree();
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
        System.out.println("Enter root data");
        int data = sc.nextInt();
        if (data == -1) return null;

        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(data);
        root.left = createTree();
        root.right = createTree();

        return root;
    }


}
