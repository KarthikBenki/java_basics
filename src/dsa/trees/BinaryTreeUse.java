package dsa.trees;

import java.util.Scanner;

public class BinaryTreeUse {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = createTreeBetter(true,0,true);
        printBinaryTreeDetailed(root);
    }

    public static void printBinaryTree(BinaryTreeNode<Integer> root) {
        if (root == null) return;

        System.out.print(root.data + " ");
        printBinaryTree(root.left);
        printBinaryTree(root.right);
    }

    public static void printBinaryTreeDetailed(BinaryTreeNode<Integer> root) {
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


    public static BinaryTreeNode<Integer> createTree() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter root data");
        int data = sc.nextInt();
        if (data == -1) return null;

        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(data);
        root.left = createTree();
        root.right = createTree();

        return root;
    }

    public static BinaryTreeNode<Integer> createTreeBetter(boolean isRoot,int parentData,boolean isLeft) {
        if (isRoot)  {
            System.out.println("Enter root data");
        }else {
            if (isLeft){
                System.out.println("Enter left child of "+parentData);
            }else {
                System.out.println("Enter right child of "+parentData);
            }
        }
        Scanner sc = new Scanner(System.in);

        int data = sc.nextInt();
        if (data == -1) return null;

        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(data);
        root.left = createTreeBetter(false,root.data,true);
        root.right = createTreeBetter(false,root.data,false);

        return root;
    }


}
