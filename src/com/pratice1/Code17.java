package com.pratice1;

import java.util.ArrayList;
/**
 * @author: wyh
 * 数的子结构
 * @Day: 2019/9/4
 */
public class Code17 {
    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }

    public void preTraversal(TreeNode root, ArrayList<Integer> array){
        if(root!=null){
            array.add(root.val);
        }
        if(root.left!=null){
            preTraversal(root.left,array);
        }
        if(root.right!=null){
            preTraversal(root.right,array);
        }
    }

    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if(root2==null || root1==null){
            return false;
        }
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        preTraversal(root1,list1);
        preTraversal(root2,list2);
        StringBuilder stringBuilder = new StringBuilder();
        for(Integer list:list1) {stringBuilder.append(list);}
        String list1Str = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        for(Integer list:list2) {stringBuilder.append(list);}
        String list2Str = stringBuilder.toString();
        if(list1Str.contains(list2Str)){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        Code17 myMain = new Code17();
        TreeNode node1 = new TreeNode(8);
        TreeNode node2 = new TreeNode(8);
        TreeNode node3 = new TreeNode(7);
        TreeNode node4 = new TreeNode(9);
        TreeNode node5 = new TreeNode(2);
        TreeNode node10 = new TreeNode(4);
        TreeNode node11 = new TreeNode(7);
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node5.left = node10;
        node5.right = node11;

        TreeNode root1 = new TreeNode(8);
        TreeNode root2 = new TreeNode(9);
        TreeNode root3 = new TreeNode(2);
        root1.left = root2;
        root1.right = root3;
        myMain.HasSubtree(node1,root1);
    }
}
