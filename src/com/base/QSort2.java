package com.base;

import java.util.stream.IntStream;

/**
 * @author: wyh
 * @Day: 2020/9/6
 */
public class QSort2 {

    private static void mySwap(int[] numbers,int start, int end){
        int t = numbers[start];
        numbers[start] = numbers[end];
        numbers[end] = t;
    }

    private static int partition(int[] numbers, int start,int end){
        int small = start-1;
        for(int i=start;i<end;i++){
            if(numbers[i]<numbers[end]){
                small++;
                if(small!=i){
                    mySwap(numbers, small, i);
                }
            }
        }
        small++;
        mySwap(numbers, small,end);
        return small;
    }

    private static void myQSort(int[] numbers,int start, int end){
        if(start==end){
            return;
        }
        int middle = partition(numbers,start,end);
        if(middle>start){
            myQSort(numbers,start,middle-1);
        }
        if(middle<end){
            myQSort(numbers,middle+1,end);
        }
    }

    public static void main(String[] args) {
        int[] numbers={1,3,4,5,2,6,8,7};
        myQSort(numbers,0,numbers.length);
        IntStream.of(numbers).forEach(System.out::println);
    }
}
