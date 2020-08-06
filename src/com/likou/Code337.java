package com.likou;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author wyh
 * @Description 动态规划考虑树，写出状态转移方程，巧妙利用f 和 g保存状态
 * @Date: 2020 08 05 下午8:49
 */
public class Code337 {
    // Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static Map<TreeNode, Integer> f = new HashMap<>();
    public static Map<TreeNode, Integer> g = new HashMap<>();

    public static void dfs(TreeNode node){
        if(node == null){
            return;
        }
        dfs(node.left);
        dfs(node.right);
        f.put(node,node.val+g.getOrDefault(node.left,0)+g.getOrDefault(node.right,0));
        g.put(node, Math.max(f.getOrDefault(node.left,0),g.getOrDefault(node.left,0))
                +Math.max(f.getOrDefault(node.right,0),g.getOrDefault(node.right,0)));
    }

    public static int rob(TreeNode root) {
        dfs(root);
        return Math.max(f.getOrDefault(root,0), g.getOrDefault(root, 0));
    }

    public static void main(String[] args) {
        String[] nums = {"zyx", "wvu", "tsr"};

    }
}
