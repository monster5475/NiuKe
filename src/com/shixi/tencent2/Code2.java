package com.shixi.tencent2;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author: wyh
 * @Day: 2020/4/13
 */
public class Code2 {
    public static int[] kNumMax(int[] numbers, int k){
        int length = numbers.length;
        int[] res = new int[length-k+1];
        Deque<Integer> arrayDeque = new LinkedList<>();
        arrayDeque.addLast(numbers[0]);
        return res;
    }
}
