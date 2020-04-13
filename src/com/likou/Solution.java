package com.likou;

import java.util.Scanner;

/**
 * @author: wyh
 * @Day: 2020/3/11
 */
public class Solution {

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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = {0,1,0,2,1,0,1,3,2,1,2,1};
        int[] height = {5,4,1,2};
        int[] height1= {9,6,8,8,5,6,3};
        int target = 0;
        System.out.println(trap(height1));
        scanner.close();
    }
}
