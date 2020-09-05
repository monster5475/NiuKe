package com.likou;

/**
 * @author: wyh
 * 二分法求解
 * @Day: 2020/9/5
 */
public class Code540 {
    public static int singleNonDuplicate(int[] nums) {
        int length = nums.length;
        int start =0, end = length-1;
        while (start<end){
            int middle = (start+end)/2;
            boolean halvesAreEven = (end - middle) % 2 == 0;
            if (nums[middle + 1] == nums[middle]) {
                if (halvesAreEven) {
                    start = middle + 2;
                } else {
                    end = middle - 1;
                }
            } else if (nums[middle - 1] == nums[middle]) {
                if (halvesAreEven) {
                    end = middle - 2;
                } else {
                    start = middle + 1;
                }
            } else {
                return nums[middle];
            }
        }
        return nums[start];
    }

}
