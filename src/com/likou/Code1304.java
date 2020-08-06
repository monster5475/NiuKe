package com.likou;

/**
 * @Author wyh
 * @Description 水题
 * @Date: 2020 08 05 下午10:08
 */
public class Code1304 {
    public int[] sumZero(int n) {
        int[] nums = new int[n];
        int sum=0;
        for(int i=0;i<n-1;i++){
            nums[i]=i;
            sum+=i;
        }
        nums[n-1] = -1* sum;
        return nums;
    }
}
