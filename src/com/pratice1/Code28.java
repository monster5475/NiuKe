package com.pratice1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author: wyh
 * 最小的k个数
 * @Date: 2019/9/11 14:38
 */
public class Code28 {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> result = new ArrayList();
        if(k>input.length || k==0){
            return result;
        }
        Queue<Integer> queue = new PriorityQueue(k, Comparator.comparingInt(Integer::intValue).reversed());
        for(int i=0;i<k;i++){
            queue.add(input[i]);
        }
        for(int i=k;i<input.length;i++){
            if(input[i]<queue.peek()){
                queue.add(input[i]);
                queue.poll();
            }
        }
        result = new ArrayList<>(queue);
        return result;
    }
}
