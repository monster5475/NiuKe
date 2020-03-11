package com.pratice2;

import java.util.Scanner;

/**
 * @author: wyh
 * 比特币最佳买入时机
 * @Day: 2020/3/8
 */
public class Code33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[1000];
        int i=0;
        while(scanner.hasNext()){
            numbers[i] = scanner.nextInt();
            i+=1;
        }
        int length = numbers.length;
        int max_=0;
        for(int j=0;j<length;j++){
            for(int k=j+1;k<length;k++){
                max_ = Math.max(max_, numbers[k]-numbers[j]);
            }
        }
        System.out.println(max_);
        scanner.close();
    }
}
