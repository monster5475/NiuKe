package com.likou;

/**
 * @Author wyh
 * @Description 考虑边界情况， 要么左拉高，要么右拉高
 * @Date: 2020 08 05 下午9:42
 */
public class Code665 {
    public static boolean checkPossibility(int[] nums) {
        int length= nums.length;
        int count=0;
        int j=1,i=0;
        for( ;i<length-1;){
            if(nums[i] > nums[j]) {
                if((i==0)||(j==length-1)||(i>0 && nums[i-1]<nums[j]) || (j<length-1 && nums[i]<nums[j+1])){
                    count ++;
                }else{
                    return false;
                }
            }
            i++;
            j++;
        }
        return count<=1;
    }
}
