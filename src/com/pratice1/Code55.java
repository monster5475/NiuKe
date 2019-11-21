package com.pratice1;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

/**
 * 把二叉树打印多行
 * @author: wyh
 * @Date: 2019/10/30 10:17
 */
public class Code55 {
    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }

    public class MyNode{
        public int layer;
        public TreeNode node;
        public MyNode(int layer, TreeNode node){
            this.layer = layer;
            this.node = node;
        }
    }

    int currentLayer = 0;

    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        Queue<MyNode> queue = new ArrayDeque<>();
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if(pRoot==null){
            return result;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        queue.add(new MyNode(0, pRoot));
        while(!queue.isEmpty()){
            MyNode myNode = queue.poll();
            if(myNode.layer == currentLayer) {
                ;
            }else{
                result.add(arrayList);
                arrayList = new ArrayList<>();
                currentLayer++;
            }
            arrayList.add(myNode.node.val);
            if(myNode.node.left!=null){
                queue.add(new MyNode(myNode.layer+1,myNode.node.left));
            }
            if(myNode.node.right!=null){
                queue.add(new MyNode(myNode.layer+1,myNode.node.right));
            }
        }
        result.add(arrayList);
        return result;
    }
}
