package com.pratice1;

/**
 * @author: wyh
 * 二叉树的深度
 * @Date: 2019/9/16 17:18
 */
public class Code37 {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }
    public void TreeTravel(int depth, TreeNode root){
        maxDepth = depth>maxDepth?depth:maxDepth;
        if(root.left!=null){
            TreeTravel(depth+1, root.left);
        }
        if(root.right!=null){
            TreeTravel(depth+1, root.right);
        }
    }
    int maxDepth=0;
    public int TreeDepth(TreeNode root) {
        int depth=1;
        if(root!=null){
            TreeTravel(depth,root);
        }
        return maxDepth;
    }
}
