package com.likou;

/**
 * @Author wyh
 * @Description 最长上升子序列，可以dp，或者辅助数组
 * @Date: 2020 07 31 下午8:45
 */
public class Code300 {
    public static int lengthOfLIS(int[] nums) {
        int length = nums.length;
        if (length == 0){
            return 0;
        }
        int[] maxLen = new int[length];
        maxLen[0] = nums[0];
        int _maxLen = 1;
        boolean flag;
        for(int i=1; i<length; i++){
            flag = true;
            for(int j=0; j<_maxLen; j++){
                if(nums[i] <= maxLen[j]){
                    maxLen[j] = nums[i];
                    flag = false;
                    break;
                }
            }
            if(flag) {
                maxLen[_maxLen] = nums[i];
                _maxLen ++;
            }
        }
        System.out.println(_maxLen);
        return _maxLen;
    }

    public static void main(String[] args) {
        int[] nums = {10,9,2,5,3,7,101,18};
        lengthOfLIS(nums);
    }
}
