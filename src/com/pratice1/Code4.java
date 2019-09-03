package com.pratice1;

/**
 * @author: wyh
 * 重建二叉树
 * @Date: 2019/9/3 13:04
 */
public class Code4 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public TreeNode reConstructBinaryTree(int [] pre, int [] in) {
        TreeNode root = new TreeNode(pre[0]);
        root.val = pre[0];
        if(pre.length > 1){
            int index = indexArray(pre[0], in);
            int begin = 0;
            int end = index - 1;
            int[] inLeft = null;
            if(end >= begin){
                inLeft = subArray(begin, end, in);
            }
            begin = index + 1;
            end = in.length - 1;
            int[] inRight = null;
            if(end >= begin){
                inRight = subArray(begin, end, in);
            }

            begin = 0 + 1;
            end = index;
            int[] preLeft = null;
            if(end >= begin){
                preLeft = subArray(begin, end, pre);
            }
            begin = index + 1;
            end = pre.length - 1;
            int[] preRight = null;
            if(end >= begin){
                preRight = subArray(begin, end, pre);
            }

            if(inLeft!=null && preLeft!=null){
                root.left = reConstructBinaryTree(preLeft, inLeft);
            }else{
                root.left = null;
            }

            if(inRight!=null && preRight!=null){
                root.right = reConstructBinaryTree(preRight, inRight);
            }else{
                root.right = null;
            }
        }else{
            root.left = null;
            root.right = null;
        }
        return root;
    }

    /**
     * 定位array中target的位置
     * @param target
     * @param array
     * @return
     */
    public int indexArray(int target,int[] array){
        for (int i=0; i<array.length; i++){
            if(array[i] == target){
                return i;
            }
        }
        return -1;
    }

    /**
     * array切割begin和end的位置，起止都要
     * @param begin
     * @param end
     * @param array
     * @return
     */
    public int[] subArray(int begin, int end, int[] array){
        int[] subArray = new int[end-begin+1];
        int index = 0;
        for(int i=begin; i<=end; i++){
            subArray[index++] = array[i];
        }
        return subArray;
    }

    /**
     * 前序遍历
     * @param root
     */
    public void preShowTree(TreeNode root){
        System.out.println(root.val);
        if(root.left != null){
            preShowTree(root.left);
        }
        if(root.right != null){
            preShowTree(root.right);
        }
    }

    public static void main(String[] args) {
        int[] pre = {1,2,4,7,3,5,6,8};
        int[] in = {4,7,2,1,5,3,8,6};
        Code4 code4 = new Code4();
        TreeNode root = code4.reConstructBinaryTree(pre, in);
        code4.preShowTree(root);
    }
}
