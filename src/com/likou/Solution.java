package com.likou;

import java.util.Scanner;

/**
 * @author: wyh
 * @Day: 2020/3/11
 */
public class Solution {

    public static int[] twoSum(int[] nums, int target) {
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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = {0,4,3,0};
        twoSum(nums,0);
        scanner.close();
    }
}
