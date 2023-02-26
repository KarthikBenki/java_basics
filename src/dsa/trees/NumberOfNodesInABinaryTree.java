package dsa.trees;

public class NumberOfNodesInABinaryTree {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = BinaryTreeUse.createTreeBetter(true,0,true);
      int count =   numberOfNodesInATree(root);
        System.out.println(count);
    }

    static int count = 0;

    public static int numberOfNodesInATree(BinaryTreeNode<Integer> root) {
       if (root == null) return 0;
        int leftCount = numberOfNodesInATree(root.left);
        int rightCount = numberOfNodesInATree(root.right);
        return leftCount+rightCount+1;
    }
}
