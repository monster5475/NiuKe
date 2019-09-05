package com.pratice1;

import java.util.stream.Collectors;
import java.util.*;

/**
 * @author: wyh
 *
 * @Date: 2019/9/3 13:04
 */


public class MyMain {

     public static class TreeNode {
     int val = 0;
     TreeNode left = null;
     TreeNode right = null;

     public TreeNode(int val) {
     this.val = val;

     }

     }
    public class Score{
         int target;
         TreeNode node;
         public Score(TreeNode node, int target){
             this.node = node;
             this.target = target;
         }
    }

    public ArrayList<Integer> deepClone(ArrayList<Integer> array){
         ArrayList<Integer> result = new ArrayList<>();
         for (int i=0;i<array.size();i++){
             result.add(new Integer(array.get(i).intValue()));
         }
         return result;
    }

    public void findPath(Score score,ArrayList<Integer> tres){
         TreeNode node = score.node;
         tres.add(node.val);
         int target = score.target - node.val;
         if(target==0){
             if(node.left==null&& node.right==null){
                 result.add(tres);
             }
         }else{
             if(node.left!=null){
                 Score left = new Score(node.left, target);
                 if(target>0) {
                     findPath(left, deepClone(tres));
                 }
             }
             if(node.right!=null){
                 Score right = new Score(node.right, target);
                 if(target>0) {
                     findPath(right, deepClone(tres));
                 }
             }
         }
    }

    ArrayList<ArrayList<Integer>> result = new ArrayList<>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        if(root==null) {
            return result;
        }
        Score score = new Score(root, target);
        ArrayList<Integer> tres = new ArrayList<>();
        findPath(score, tres);
        return result.stream().sorted((res1,res2)->{return res2.size()-res1.size();}).collect(Collectors.toCollection(ArrayList::new));
    }
    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(10);
        TreeNode node2 = new TreeNode(5);
        TreeNode node3 = new TreeNode(12);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(7);
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        MyMain myMain = new MyMain();
        int target = 22;
        myMain.FindPath(node1, target);
        System.out.println();
    }
}
