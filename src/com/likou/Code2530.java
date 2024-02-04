/**
 * @author: wuyh_1
 * @date: 2024年1月31日 21:01:46
 */
package com.likou;

import java.util.Collections;
import java.util.PriorityQueue;

public class Code2530 {
    public long maxKelements(int[] nums, int k) {
        long sum = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for (int num : nums) {
            queue.add(num);
        }
        while (k > 0) {
            Integer s = queue.poll();
            sum += s;
            Integer nnum = Integer.valueOf((int) Math.ceil(s / 3.0));
            queue.add(nnum);
            k--;
        }
        return sum;
    }
}
