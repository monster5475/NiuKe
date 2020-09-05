package com.base;

import java.util.stream.IntStream;

/**
 * @author: wyh
 * 快速排序
 * @Day: 2020/9/5
 */
public class QSort {
    public static void myQsort(int[] numbers,int start,int end){
        if(start>=end){
            return;
        }
        int number = numbers[start];
        int left = start, right = end;
        while (left!=right){
            while (left<right && numbers[right]>=number){
                right--;
            }
            while (left<right && numbers[left]<=number){
                left++;
            }
            if(left<right) {
                int t = numbers[left];
                numbers[left] = numbers[right];
                numbers[right] = t;
            }
        }
        numbers[start] = numbers[left];
        numbers[left] = number;
        myQsort(numbers, start,left-1);
        myQsort(numbers, left+1, end);
    }

    public static void main(String[] args) {
        int[] arrays= {2,5,1,2,6,4,3};
        myQsort(arrays,0,arrays.length-1);
        IntStream.of(arrays).forEach(System.out::println);
    }
}
