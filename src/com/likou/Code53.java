package com.likou;

/**
 * @author: wyh
 * @Day: 2020/4/16
 */
public class Code53 {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int length = nums.length;
        int[] dp = new int[length];
        dp[0] = nums[0];
        for(int i=1;i<length;i++){
            dp[i] = dp[i-1] +nums[i];
            dp[i] = Math.max(dp[i], nums[i]);
        }
        for(int i=0;i<length;i++){
            max = Math.max(max, dp[i]);
        }
        return max;
    }
}
