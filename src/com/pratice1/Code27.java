package com.pratice1;

/**
 * @author: wyh
 * 主元素
 * @Date: 2019/9/10 14:23
 */
public class Code27 {
    public int MoreThanHalfNum_Solution(int [] array) {
        int length = array.length;
        int count = 0;
        int flag = 1;
        if(length==1) {
            return array[0];
        }
        for(int i=1;i<length-1;i++){
            if(array[flag] == array[i+1]){
                count++;
            }else {
                count--;
            }
            if(count==-1){
                count = 0;
                flag = i+1;
            }
            if(count>=(length-i)/2){
                return array[flag];
            }
        }
        return 0;
    }
}
