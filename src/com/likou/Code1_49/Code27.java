package com.likou.Code1_49;

/**
 * @author: wyh
 * 移除元素
 * @Day: 2020/3/30
 */
public class Code27 {
    public int removeElement(int[] nums, int val) {
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[index] = nums[i];
                index+=1;
            }
        }
        return index;
    }
}
