package com.likou.Code50_100;

/**
 * @author: wyh
 * 跳跃游戏
 * @Day: 2020/4/16
 */
public class Code55 {
    public static boolean canJump(int[] nums) {
        int length = nums.length;
        int[] dp = new int[length];
        if(length<=1){
            return true;
        }
        boolean[] flags = new boolean[length];
        flags[0] = true;
        for(int i=0;i<length-1;i++){
            int end = i+nums[i];
            end = Math.min(end, length-1);
            if(flags[i]) {
                for (int j = i + 1; j <= end; j++) {
                    flags[j] = true;
                }
            }
        }
        if(!flags[length-1]){
            return false;
        }
        return true;
    }
}
