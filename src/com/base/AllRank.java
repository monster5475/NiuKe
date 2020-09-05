package com.base;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author: wyh
 * 全排列去重问题
 * @Day: 2020/9/5
 */
public class AllRank {
    private static List<String> result1;

    private static List<String> result2;

    private static boolean isSwap(int[] numbers, int start, int end){
        if(start!=end){
            for(int i=start;i<end;i++){
                if(numbers[i]==numbers[end]){
                    return false;
                }
            }
        }
        return true;
    }

    private static void allRank1(int[] numbers, int loc){
        if(loc == numbers.length) {
            List<String> strings = IntStream.of(numbers).boxed().map(String::valueOf).collect(Collectors.toList());
            String res = String.join(",", strings);
            result1.add(res);
        }
        for(int i=loc;i<numbers.length;i++){
            if(isSwap(numbers, loc, i)) {
                int t = numbers[loc];
                numbers[loc] = numbers[i];
                numbers[i] = t;
                allRank1(numbers, loc + 1);
                t = numbers[i];
                numbers[i] = numbers[loc];
                numbers[loc] = t;
            }
        }
    }

    public static void main(String[] args) {
        result1 = new ArrayList<>();
        int[] numbers = {1,2,2};
        allRank1(numbers,0);
        result1.stream().forEach(System.out::println);
    }
}
