package com.likou;

/**
 * @Author wyh
 * @Description 深度搜索时进行左右子树的均衡
 * @Date: 2020 08 18 下午7:56
 */
public class Code979 {
      public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

    public static int ans;

    public static int dfs(TreeNode node){
        if(node==null){
            return 0;
        }
        int L = dfs(node.left);
        int R = dfs(node.right);
        ans = ans+Math.abs(L)+Math.abs(R);
        return L+R+node.val-1;
    }

    public int distributeCoins(TreeNode root) {
        ans=0;
        dfs(root);
        return ans;
    }
}
