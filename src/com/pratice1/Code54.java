package com.pratice1;

/**
 * 二叉搜索树的第k个结点
 * @author: wyh
 * @Date: 2019/10/30 9:52
 */
public class Code54 {
    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    int count=0;
    boolean flag = false;
    TreeNode desNode = null;

    void middleTree(TreeNode node, int k){

        if(node.left!=null){
            middleTree(node.left, k);
        }else if(flag==false){
            flag = true;
        }
        if(flag){
            count++;
        }
        if(count==k){
            desNode = node;
        }
        if(node.right !=null){
            middleTree(node.right, k);
        }
    }

    TreeNode KthNode(TreeNode pRoot, int k)
    {
        if(k!=0 && pRoot!=null){
            middleTree(pRoot, k);
        }
        return desNode;
    }

    public static void main(String[] args) {
        Code54 myMain = new Code54();
        TreeNode treeNode1 = new TreeNode(5);
        TreeNode treeNode2 = new TreeNode(3);
        TreeNode treeNode3 = new TreeNode(7);
        TreeNode treeNode4 = new TreeNode(2);
        TreeNode treeNode5 = new TreeNode(4);
        TreeNode treeNode6 = new TreeNode(6);
        TreeNode treeNode7 = new TreeNode(8);
        treeNode1.left = treeNode2;
        treeNode2.left = treeNode4;
        treeNode3.left = treeNode6;
        treeNode1.right = treeNode3;
        treeNode2.right = treeNode5;
        treeNode3.right = treeNode7;
        TreeNode node = myMain.KthNode(treeNode1,3);
        if(node!=null){
            System.out.println(node.val);
        }
    }
}
