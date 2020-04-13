package com.likou.Code1_49;

/**
 * @author: wyh
 * 接雨水
 * @Day: 2020/4/13
 */
public class Code42 {
    public static int trap(int[] height) {
        int length = height.length;
        int left = 0, right =length-1;
        int leftMax = Integer.MIN_VALUE, rightMax = Integer.MIN_VALUE;
        int sum=0;
        while(left<right){
            if(height[left]<height[right]){
                leftMax = Math.max(leftMax, height[left]);
                sum+=leftMax-height[left];
                left+=1;
            }else{
                rightMax = Math.max(rightMax, height[right]);
                sum+=rightMax-height[right];
                right-=1;
            }
        }
        return sum;
    }
}
