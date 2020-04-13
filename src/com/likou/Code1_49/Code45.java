package com.likou.Code1_49;

/**
 * @author: wyh
 * 跳跃游戏II
 * @Day: 2020/4/7
 */
public class Code45 {
    public static int jump(int[] nums) {
        int length = nums.length;
        int[] dp = new int[length];
        if(length<=1){
            return 0;
        }
        dp[0] = 0;
        for(int i=1;i<nums.length;i++){
            dp[i] = dp[i-1]+1;
        }
        for(int i=0;i<nums.length;i++){
            int end;
            if(i+nums[i]<length) {
                end = i+nums[i];
            }else{
                end = length-1;
            }
            for(int j=i+1;j<=end;j++){
                dp[j] = Math.min(dp[i]+1, dp[j]);
            }
        }
        return dp[length-1];
    }
}
