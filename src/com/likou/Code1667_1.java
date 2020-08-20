package com.likou;

/**
 * @Author wyh
 * @Description 是否平衡树
 * @Date: 2020 08 14 下午7:41
 */
public class Code1667_1 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public static boolean flag;
    public static int getHeight(TreeNode node){
        if(node == null){
            return 0;
        }
        int left = 0,right = 0;
        if(flag) {
            left = getHeight(node.left);
        }

        if(flag){
            right = getHeight(node.right);
        }
        if(Math.abs(left-right)>1){
            flag = false;
        }
        return Math.max(left,right)+1;
    }

    public boolean isBalanced(TreeNode root) {
        flag =true;
        getHeight(root);
        return flag;
    }
}
