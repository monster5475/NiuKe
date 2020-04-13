package com.likou.Code1_49;

/**
 * @author: wyh
 * 搜索插入的位置
 * @Day: 2020/4/1
 */
public class Code35 {
    public int searchInsert(int[] nums, int target) {
        int length= nums.length;
        int index=0;
        for(int i=length-1;i>=0;i--){
            if(nums[i]>target){
                ;
            }else if(nums[i] == target){
                return i;
            }else{
                index=i+1;
                break;
            }
        }
        return index;
    }
}
