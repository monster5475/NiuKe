package com.likou;

/**
 * @Author wyh
 * @Description 斐波那契 水题
 * @Date: 2020 08 13 下午9:12
 */
public class Code1570 {
    public int fib(int n) {

        long[] nums =  new long[101];
        nums[0] = 0;
        nums[1] = 1;
        long limit = (long)Math.pow(10,9) + 7;
        int length = 101;
        for(int i=2;i<length;i++){
            nums[i] = nums[i-1] + nums[i-2];
            nums[i] = nums[i] > limit ? nums[i]%limit : nums[i];
        }

        return (int) (nums[n] > limit ? nums[n]%limit : nums[n]);
    }
}
