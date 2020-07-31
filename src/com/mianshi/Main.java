package com.mianshi;

/**
 * @author: wyh
 * @Day: 2020/3/11
 */
public class Main {

    public static void main(String[] args) {
        int n1=3;
        int n2=6;
        float sum=0;
        float input1=20;
        float input2=15;
        float rate = 0.05f;
        for(int i=0;i<n1;i++){
            sum = (input1+sum) * (1+rate);
            System.out.println(sum);
        }
        for(int i=0;i<n2;i++){
            sum = (input2+sum) * (1+rate);
            System.out.println(sum);
        }
    }
}
