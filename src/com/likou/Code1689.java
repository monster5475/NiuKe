package com.likou;

/**
 * @Author wyh
 * @Description 简单题
 * @Date: 2020 07 31 下午8:29
 */
public class Code1689 {
    public static int findMagicIndex(int[] nums) {
        int length = nums.length;
        for (int i=0; i<length; i++){
            if(i == nums[i]){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {0,2,3,4,5};
        findMagicIndex(nums);
    }
}
