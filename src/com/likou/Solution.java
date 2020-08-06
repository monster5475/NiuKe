package com.likou;

import sun.security.util.Length;

import java.util.*;

/**
 * @author: wyh
 * @Day: 2020/3/11
 */
public class Solution {


    public int[] sumZero(int n) {
        int[] nums = new int[n];
        int sum=0;
        for(int i=0;i<n-1;i++){
            nums[i]=i;
            sum+=i;
        }
        nums[n-1] = sum;
        return nums;
    }

    public static void main(String[] args) {

        int[] nums = {3,4,2,3};
        checkPossibility(nums);

    }
}
