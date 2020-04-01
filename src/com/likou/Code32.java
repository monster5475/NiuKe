package com.likou;

/**
 * @author: wyh
 * 最长有效括号
 * @Day: 2020/4/1
 */
public class Code32 {
    public static int longestValidParentheses(String s) {
        int length = s.length();
        int[] dp = new int[length];
        for(int i=1;i<length;i++){
            if(s.charAt(i)==')'){
                if(s.charAt(i-1)=='('){
                    dp[i] = dp[i-2>0?i-2:0]+2;
                }else{
                    if(i-dp[i-1]-1>=0 && s.charAt(i-dp[i-1]-1)=='('){
                        dp[i] = 2+dp[i-1]+dp[(i-dp[i-1]-2)>0?(i-dp[i-1]-2):0];
                    }
                }
            }
        }
        int max = 0;
        for(int i=0;i<length;i++){
            max = Math.max(max, dp[i]);
        }
        return max;
    }
}
