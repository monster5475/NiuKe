package com.likou;


/**
 * @author: wyh
 * @Day: 2020/3/11
 */
public class Solution {

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

    public static void main(String[] args) {
        int n=2;
        int[] numbers={3,3,7,7,10,11,11};
        singleNonDuplicate(numbers);
    }
}
