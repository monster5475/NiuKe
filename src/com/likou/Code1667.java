package com.likou;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author wyh
 * @Description 队列中序遍历
 * @Date: 2020 08 13 下午8:47
 */
public class Code1667 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public static Queue<TreeNode> queue = new LinkedList<>();

    public void travel(TreeNode node){
        if(node.left ==null && node.right==null){
            queue.add(node);
            return ;
        }
        if(node.left!=null){
            travel(node.left);
        }
        queue.add(node);
        if(node.right!=null){
            travel(node.right);
        }
    }
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        travel(root);
        TreeNode node=null;
        while (!queue.isEmpty()){
            if(p.val == queue.peek().val){
                queue.poll();
                node = queue.peek();
            }else{
                queue.poll();
            }
        }
        return node;
    }

}
