package com.pratice1;

import jdk.nashorn.internal.ir.Flags;

import java.util.Stack;

/**
 * @author: wyh
 * @Date: 2019/9/3 13:04
 */
public class MyMain {

    public int NumberOf1(int n) {
        int res = 0;
        Stack<Integer> content = new Stack<>();
        int index = 0;
        if(n < 0){
            int[] array = new int [32];
            n = -1 * n;
            while(n!=0){
                array[index++] = n%2;
                n = n/2;
            }
            int count = 0;
            boolean flag = false;
            for(int i=0; i<32; i++){
                if(flag) {
                    if(array[i]==0) {
                        array[i] = 1;
                        count++;
                    }else if(array[i]==1){
                        array[i] = 0;
                    }
                }
                if(array[i]!=0 && flag==false){
                    flag = true;
                    count = 1;
                }
            }
            res = count;
        }
        else if(n==0){
            res = 0;
        }else{
            int count = 0;
            while(n != 0){
                content.push(n%2);
                n = n/2;
            }
            while (!content.isEmpty()){
                if(content.pop()==1){
                    count++;
                }
            }
            res = count;
        }
        return res;
    }

    public static void main(String[] args) {
        MyMain myMain = new MyMain();
        int index = myMain.NumberOf1(-1);
        System.out.println(index);
    }
}
