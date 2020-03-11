package com.pratice2;

import java.util.Scanner;

/**
 * @author: wyh
 * 求连续子数组的最大和
 * @Day: 2020/3/7
 */
public class Code26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int result = 0;
        String[] numbers_str = str.split(",");
        int length = numbers_str.length;
        int[] numbers = new int[length];
        for(int i=0;i<length;i++){
            numbers[i] = Integer.valueOf(numbers_str[i]);
            if(numbers[i]>0){
                result = -1;
            }
        }
        if(result==-1){
            int[] dp = new int[length+1];
            int sum=0;
            for(int i=1;i<length+1;i++){
                sum+=numbers[i-1];
                if(numbers[i-1]<=0){
                    dp[i] = dp[i-1];
                }else {
                    dp[i] = Math.max(numbers[i-1], sum);
                    sum=dp[i]==sum?sum:numbers[i-1];
                }
            }
            result = dp[length];
        }
        System.out.println(result);
        scanner.close();
    }
}
