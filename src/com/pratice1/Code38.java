package com.pratice1;

/**
 * @author: wyh
 * 平衡二叉树
 * @Date: 2019/9/17 10:13
 */
public class Code38 {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }

    Boolean flag = true;

    public int TreeTravel(TreeNode node, int depth){
        int leftDepth=0,rightDepth=0;
        if(node.left!=null){
            leftDepth = TreeTravel(node.left, depth+1);
        }
        if(node.right!=null){
            rightDepth = TreeTravel(node.right, depth+1);
        }
        if(Math.abs(leftDepth-rightDepth)>1 && flag){
            flag = false;
        }
        return leftDepth>rightDepth?leftDepth+1:rightDepth+1;
    }

    public boolean IsBalanced_Solution(TreeNode root) {
        int depth = 1;
        if(root!=null) {
            TreeTravel(root, depth);
        }
        return flag;
    }
}
