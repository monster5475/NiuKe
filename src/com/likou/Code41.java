package com.likou;

/**
 * @author: wyh
 * 缺失的第一个正数
 * @Day: 2020/4/3
 */
public class Code41 {
    public int firstMissingPositive(int[] nums) {
        int length = nums.length;
        int count=0;
        for(int i=0;i<length;i++){
            if(nums[i]!=1){
                count+=1;
            }
        }
        if(count==length){
            return 1;
        }
        for(int i=0;i<length;i++){
            if(nums[i]<=0){
                nums[i]=1;
            }
        }
        for(int i=0;i<length;i++){
            int t = nums[i];
            int index = Math.abs(t)-1;
            if(index<length && nums[index]>0) {
                nums[index] =-nums[index];
            }
        }
        for(int i=0;i<length;i++){
            if(nums[i]>0){
                return i+1;
            }
        }
        return length+1;
    }
}
