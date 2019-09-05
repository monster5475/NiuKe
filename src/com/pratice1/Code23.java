package com.pratice1;

import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 * @author: wyh
 * 二叉树中和为某值的路径
 * @Date: 2019/9/5 19:03
 */
public class Code23 {
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
}
