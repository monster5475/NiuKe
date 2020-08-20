package com.likou;

/**
 * @Author wyh
 * @Description 水题
 * @Date: 2020 08 18 下午5:06
 */
public class Code268 {
    public int missingNumber(int[] nums) {
        int length = nums.length;
        int sum = (length)*(length+1)/2;
        for(int i=0;i<length;i++){
            sum -= nums[i];
        }
        return sum;
    }
}
