package com.pratice1;

import java.util.ArrayList;

/**
 * @author: wyh
 * 和为S的两个数字
 * @Date: 2019/9/17 14:04
 */
public class Code41 {
    public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(0);
        arrayList.add(0);
        int maxNum = Integer.MAX_VALUE;
        int length = array.length;
        int i=0,j=length-1;
        while(i<length){
            int tsum = array[i]+array[j];
            if(tsum==sum){
                if(maxNum>array[i]*array[j]){
                    maxNum = array[i]*array[j];
                    int min =Math.min(array[i],array[j]),max =Math.max(array[i],array[j]);
                    arrayList.set(0, Integer.valueOf(min));
                    arrayList.set(1, Integer.valueOf(max));
                }
                i++;
                j--;
            }else if(tsum<sum){
                i++;
                continue;
            }else{
                j--;
            }
            if(i>=j){
                j=length-1;
                i++;
            }
        }
        if(arrayList.get(0).equals(0)&&arrayList.get(1).equals(0)){
            arrayList = new ArrayList<>();
        }
        return arrayList;
    }
}
