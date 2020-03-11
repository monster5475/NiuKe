package com.likou;

/**
 * @author: wyh
 * 两数之和
 * @Day: 2020/3/11
 */
public class Code1 {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int length = nums.length;
        for(int i=0;i<length-1;i++){
            boolean flag = false;
            for(int j=i+1;j<length;j++){
                if((nums[i]+nums[j]) == target){
                    result[0] = i;
                    result[1] = j;
                    flag = true;
                    break;
                }
            }
            if(flag){
                break;
            }
        }
        return result;
    }
}
