package com.pratice1;

/**
 * @author: wyh
 * 二叉搜索树与双向链表
 * @Day: 2019/9/9
 */
public class Code25 {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }

    public TreeNode middleForEach(TreeNode root, boolean rightFlag){
        if(root.left!=null){
            TreeNode rootLeft = middleForEach(root.left, false);
            rootLeft.right = root;
            root.left = rootLeft;
        }
        if(root.right!=null){
            TreeNode rootRight = middleForEach(root.right,true);
            rootRight.left = root;
            root.right = rootRight;
        }
        if(rightFlag == true){
            root = root.left==null?root:root.left;
        }else{
            root = root.right==null?root:root.right;
        }
        return root;
    }

    public TreeNode Convert(TreeNode pRootOfTree) {
        if(pRootOfTree==null) {
            return pRootOfTree;
        }
        middleForEach(pRootOfTree, true);
        TreeNode head = pRootOfTree;
        while (head.left != null) {
            head = head.left;
        }
        return head;
    }
}
