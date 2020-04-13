package com.likou.Code1_49;

/**
 * @author: wyh
 * 盛最多水的容器
 * @Day: 2020/3/17
 */
public class Code11 {
    public static int maxArea(int[] height) {
        int length = height.length;
        int start = 0, end = length-1;
        int maxSize = 0;
        int min;
        int size;
        while(start<end){
            min = Math.min(height[start], height[end]);
            size = min* (end-start);
            maxSize = Math.max(maxSize, size);
            if(min == height[end]){
                while(height[end]<=min && start<end){
                    end-=1;
                }
            }else{
                start = start+1;
                while(height[start]<=min && start<end){
                    start+=1;
                }
            }
        }
        return maxSize;
    }
}
