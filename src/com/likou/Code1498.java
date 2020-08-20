package com.likou;

import java.util.Arrays;

/**
 * @Author wyh
 * @Description 双指针 滑动窗口
 * @Date: 2020 08 20 下午1:52
 */
public class Code1498 {
    public static int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int mod = 1000000007;
        int[] tmp = new int[n];
        tmp[0] = 1;
        for (int i = 1; i < n; i++) {
            tmp[i] = (tmp[i - 1] << 1) % mod;
        }
        int res = 0;
        int l = 0;
        int r = nums.length - 1;
        while (l <= r) {
            if (nums[l] + nums[r] > target) {
                r--;
            } else {
                res = (res + tmp[r - l]) % mod;
                l++;
            }
        }
        return res;
    }
}
