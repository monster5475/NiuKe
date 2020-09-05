package com.shixi.tencent2;

/**
 * @author: wyh
 * @Day: 2020/4/13
 */
public class Code1 {
    public static int lastLongSum(int[] numbers){
        int length = numbers.length;
        int[] dp = new int[length];
        if(numbers[0]>0){
            dp[0] = numbers[0];
        }
        for(int i=1;i<length;i++){
            dp[i] = dp[i-1] +numbers[i];
            dp[i] = Math.max(dp[i],numbers[i]);
        }
        int max = Integer.MIN_VALUE;
        for(int i=0;i<length;i++){
            max = Math.max(max, dp[i]);
        }
        return max;
    }
}
