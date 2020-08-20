package com.likou;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author wyh
 * @Description 双指针+队列模拟
 * @Date: 2020 08 19 下午3:24
 */
public class Code1208 {
    public static int equalSubstring(String s, String t, int maxCost) {
        int length = s.length();
        int left=0,right=0;
        int cnt=0;
        Queue<Integer> queue = new LinkedList<>();
        int max = Integer.MIN_VALUE;
        while (right<length){
            int n = Math.abs(s.charAt(right) - t.charAt(right));
            if(maxCost>=n){
                maxCost-=n;
                queue.add(n);
                right+=1;
            }else{
                while (!queue.isEmpty() && maxCost<n){
                    maxCost+=queue.poll();
                    left+=1;
                }
                if(maxCost<n){
                    right+=1;
                    left+=1;
                }
            }
            max = Math.max(max, queue.size());
        }
        return max;
    }
}
