package com.pratice1;

import java.util.PriorityQueue;

/**
 * @author: wyh
 * 数据流中的中位数
 * @Date: 2019/10/28 11:42
 */
public class Code53 {
    PriorityQueue<Integer> queue = new PriorityQueue<>((n1, n2)->n1<n2?1:-1);

    public void Insert(Integer num) {
        queue.add(num);
    }

    public Double GetMedian() {
        PriorityQueue<Integer> myQueue = new PriorityQueue<>((n1,n2)->n1<n2?1:-1);
        myQueue.addAll(queue);
        Double result = 0.0;
        int size = myQueue.size();
        if(size%2==0){
            int mid = size/2;
            int count=1, num1,num2;
            while(count<mid){
                myQueue.poll();
                count++;
            }
            num1 = myQueue.poll();
            num2 = myQueue.peek();
            result = Double.valueOf((num1+num2)/2.0);
        }else {
            int count=1,mid = (size+1)/2;
            while(count<mid){
                myQueue.poll();
                count++;
            }
            result = Double.valueOf(myQueue.peek().doubleValue());
        }
        return result;
    }
}
