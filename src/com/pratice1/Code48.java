package com.pratice1;

/**
 * @author: wyh
 * 数组中重复的数字
 * @Date: 2019/9/21 14:54
 */
public class Code48 {
    // Parameters:
    //    numbers:     an array of integers
    //    length:      the length of array numbers
    //    duplication: (Output) the duplicated number in the array number,length of duplication array is 1,so using duplication[0] = ? in implementation;
    //                  Here duplication like pointor in C/C++, duplication[0] equal *duplication in C/C++
    //    这里要特别注意~返回任意重复的一个，赋值duplication[0]
    // Return value:       true if the input is valid, and there are some duplications in the array number
    //                     otherwise false
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        boolean[] array= new boolean[length];
        boolean flag = false;
        for(int i=0; i<length; i++){
            if(array[numbers[i]]!=true){
                array[numbers[i]] = true;
            }else{
                duplication[0] = numbers[i];
                flag = true;
                break;
            }
        }
        if(flag){
            return true;
        }else{
            return false;
        }
    }
}
