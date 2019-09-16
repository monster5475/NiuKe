package com.pratice1;

/**
 * @author: wyh
 * 连续子数组的最大和
 * @Date: 2019/9/12 11:37
 */
public class Code29 {
    public int count(int[] array, int begin, int end){
        int sum = 0;
        for(int i=begin;i<=end;i++){
            sum+=array[i];
        }
        return sum;
    }

    public int FindGreatestSumOfSubArray(int[] array) {
        int max = Integer.MIN_VALUE;
        int length = array.length;
        for(int i=0; i<length; i++){
            max = Math.max(max, array[i]);
            for(int j=i+1;j<length;j++){
                max= Math.max(max, count(array, i, j));
            }
        }
        return max;
    }
}
