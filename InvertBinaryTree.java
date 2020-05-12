package io.dowlath.javachallenges.leetcode;

/**
 * @Author Dowlath
 * @create 5/12/2020 2:33 AM
 */

// Binary tree , left swap to right...ie invert binary tree
public class InvertBinaryTree {
       private  TreeNode root;
       private  class TreeNode{
           TreeNode left;
           TreeNode right;
           int data;
           TreeNode(int data){
               this.data = data;
           }
       }
       private void createBinaryTree(){
            TreeNode first = new TreeNode(4);
            TreeNode second = new TreeNode(2);
            TreeNode third = new TreeNode(7);
            TreeNode fourth = new TreeNode(1);
            TreeNode fifth = new TreeNode(3);
            TreeNode sixth = new TreeNode(6);
            TreeNode seventh = new TreeNode(9);

            root = first;
            root.left = second;
            root.right = third;

            second.left= fourth;
            second.right = fifth;

            third.left = sixth;
            third.right = seventh;
       }

       private void postOrder(TreeNode root){
           if( root == null){
               return;
           }
           postOrder(root.left);
           postOrder(root.right);
           System.out.print(root.data+"   ");
       }

    public static void main(String[] args) {
        InvertBinaryTree invertBinaryTree = new InvertBinaryTree();
        invertBinaryTree.createBinaryTree();
        invertBinaryTree.postOrder(invertBinaryTree.root);
        TreeNode treeNode = invertTree(invertBinaryTree.root);
        System.out.println(treeNode.data+"   ");
    }

    private static TreeNode invertTree(TreeNode root){
        if(root == null){
            return null;
        }
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        root.left = right;
        root.right = left;
        return root;
    }
}
