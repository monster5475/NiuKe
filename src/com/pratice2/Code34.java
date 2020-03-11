package com.pratice2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author: wyh
 * 爱吃猫粮的小招喵
 * @Day: 2020/3/8
 */
public class Code34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String p_str = scanner.nextLine();
        String[] p__ = p_str.split(" ");
        int length = p__.length;
        int hour = scanner.nextInt();
        int[] p = new int[length];
        for(int i=0;i<length;i++){
            p[i] = Integer.valueOf(p__[i]);
        }
        Arrays.sort(p);
        int index = 0;
        for(int i=p[length-1];i>0;i--){
            int hour_=0;
            for(int j=0;j<length;j++){
                double tp = (double)p[j];
                hour_+= Math.ceil(tp/i);
                if(hour_>hour){
                    break;
                }
            }
            if(hour_<=hour){
                index = i;
            }else{
                break;
            }
        }
        System.out.println(index);
        scanner.close();
    }
}
