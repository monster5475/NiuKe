package com.mianshi.tencent2;

/**
 * @author: wyh
 * @Day: 2020/4/13
 */
public class Code3 {
    public static int three(int[] numbers){
        int length = numbers.length;
        int res=0;
        for(int i=0;i<length;i++){
            res ^=numbers[i];
        }
        return res;
    }
}
