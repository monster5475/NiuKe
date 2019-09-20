package com.pratice1;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author: wyh
 * 数组中只出现一次的数字
 * @Date: 2019/9/17 10:50
 */
public class Code39 {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        int length = array.length;
        int[] num = new int[2];
        Set<Integer> set = Arrays.stream(array)
                .boxed()
                .collect(Collectors.groupingBy(Integer::intValue, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e->e.getValue().intValue()>=2)
                .map(e->Integer.valueOf(e.getKey().intValue()))
                .collect(Collectors.toSet());
        int j=0;
        for(int i=0;i<length;i++){
            if(set.contains(array[i])){
                ;
            }else{
                num[j++]=array[i];
            }
        }
        num1[0] = num[0];
        num2[0] = num[1];
    }
}
