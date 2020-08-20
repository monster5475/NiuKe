package com.likou;

/**
 * @Author wyh
 * @Description 数据结构 水题
 * @Date: 2020 08 13 下午6:43
 */
public class Code303 {
    public int[] sums;
    public Code303(int[] nums) {
        int length = nums.length;
        sums = new int[length];
        for(int i=0;i<length;i++){
            if(i==0){
                sums[i] = nums[i];
            }else{
                sums[i] = sums[i-1] + nums[i];
            }
        }
    }

    public int sumRange(int i, int j) {
        return i>0?(sums[j] - sums[i-1]):sums[j];
    }
}
