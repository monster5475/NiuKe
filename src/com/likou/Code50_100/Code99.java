package com.likou.Code50_100;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author wyh
 * @Description 二叉搜索树的恢复
 * @Date: 2020 08 08 下午11:35
 */
public class Code99 {

    public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; this.left=null; this.right =null;}
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

    public static ArrayList<Integer> arrayList;

    public static void travel(TreeNode node){
        if(node.left == null && node.right == null){
            arrayList.add(node.val);
            return;
        }
        if(node.left!=null){
            travel(node.left);
        }
        arrayList.add(node.val);
        if(node.right != null){
            travel(node.right);
        }
    }

    public static void recoverTree(TreeNode root) {
        arrayList = new ArrayList();
        travel(root);
        int errNum_i=0, errNum_j=0;
        int index=0;
        for(int i=0;i<arrayList.size()-1;i++){
            if(arrayList.get(i) >arrayList.get(i+1)){
                errNum_i=arrayList.get(i);
                errNum_j= arrayList.get(i+1);
                index=i+1;
                break;
            }
        }
        for(int i=index;i<arrayList.size();i++){
            if(arrayList.get(i) <arrayList.get(index)){
                errNum_j= arrayList.get(i);
                break;
            }
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode treeNode = queue.poll();
            if(treeNode.val == errNum_i){
                treeNode.val = errNum_j;
            }else if(treeNode.val == errNum_j){
                treeNode.val = errNum_i;
            }
            if(treeNode.left!=null){
                queue.add(treeNode.left);
            }
            if(treeNode.right!=null){
                queue.add(treeNode.right);
            }
        }
    }
}
