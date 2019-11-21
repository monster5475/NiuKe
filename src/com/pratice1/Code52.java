package com.pratice1;

import java.util.ArrayList;

/**
 * @author: wyh
 * 滑动窗口的最大值
 * @Date: 2019/10/28 11:21
 */
public class Code52 {
    public ArrayList<Integer> maxInWindows(int [] num, int size)
    {

        ArrayList<Integer> res = new ArrayList<>();
        if (size==0 || size>num.length) {
            return res;
        }
        int max = Integer.MIN_VALUE;
        for(int i=0; i<size; i++){
            max = Math.max(num[i], max);
        }
        res.add(max);
        for(int i=size; i<num.length; i++){
            if(num[i-size]==max){
                max = Integer.MIN_VALUE;
                for(int j=i-size+1;j<=i;j++){
                    max = Math.max(num[j], max);
                }
            }else {
                max = Math.max(num[i], max);
            }
            res.add(max);
        }
        return res;
    }
}
