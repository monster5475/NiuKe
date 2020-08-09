package com.likou;

/**
 * @Author wyh
 * @Description dp三维数组
 * @Date: 2020 08 09 下午11:05
 */
public class Code474 {

    public static int[] count(String str){
        int[] cnt = new int[2];
        for(int i=0;i<str.length();i++){
            cnt[str.charAt(i)-'0']++;
        }
        return cnt;
    }

    public static int findMaxForm(String[] strs, int m, int n) {
        int length = strs.length;
        int[][][] dp = new int[length+1][m+1][n+1];
        for(int i=1;i<=length;i++){
            int[] cnt = count(strs[i-1]);
            for(int j=0;j<=m;j++){
                for(int k=0;k<=n;k++){
                    dp[i][j][k] = dp[i-1][j][k];
                    if(j>=cnt[0] && k>=cnt[1]){
                        dp[i][j][k] = Math.max(dp[i][j][k], 1+dp[i-1][j-cnt[0]][k-cnt[1]]);
                    }
                }
            }
        }
        return dp[length][m][n];
    }
}
