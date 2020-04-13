package com.likou.Code1_49;

import java.util.Arrays;

/**
 * @author: wyh
 * 最接近的三数之和
 * @Day: 2020/3/24
 */
public class Code16 {
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int length = nums.length;
        int min=Integer.MAX_VALUE;
        int result = 0;
        for(int i=1;i<length-1;i++){
            int l = i-1;
            int r = i+1;
            while(l>=0&&r<=length-1){
                int sum = nums[l]+nums[i]+nums[r];
                if(sum>target){
                    if(sum-target<min){
                        min = sum-target;
                        result = sum;
                    }
                    l-=1;
                }else if(sum==target){
                    return target;
                }else if(sum<target){
                    r+=1;
                    if(target-sum<min){
                        min = target-sum;
                        result = sum;
                    }
                }
            }
        }
        return result;
    }
}
