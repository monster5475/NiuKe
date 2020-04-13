package com.likou.Code1_49;

/**
 * @author: wyh
 * 删除排序数组中的重复项
 * @Day: 2020/3/30
 */
public class Code26 {
    public int removeDuplicates(int[] nums) {
        int index=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i] == nums[i-1]){
                ;
            }else{
                nums[index] = nums[i];
                index+=1;
            }
        }
        return index;
    }
}
