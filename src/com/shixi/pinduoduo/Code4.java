package com.shixi.pinduoduo;

import java.util.Scanner;

/**
 * @author: wyh
 * @Day: 2020/4/10
 */
public class Code4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        k = k+1;
        int[] numbers = new int[n];
        for(int i=0;i<n;i++){
            numbers[i] = scanner.nextInt();
        }
        int[][] dp = new int[k][n];
        dp[0][0] = 1;
        for(int i=1;i<n;i++){
            if(numbers[i-1] == numbers[i]){
                dp[0][i] = dp[0][i-1]+1;
            }else{
                dp[0][i]=1;
            }
        }
        for(int i=1;i<k;i++){
            dp[i][0] = 1;
        }
        for(int i=1;i<k;i++){
            for(int j=1;j<n;j++){
                if(numbers[j] == numbers[j-1]){
                    dp[i][j] = dp[i][j-1]+1;
                }else{
                    dp[i][j] = dp[i-1][j-1];
                }
            }
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max = Math.max(dp[k-1][i], max);
        }
        System.out.println(max);
        scanner.close();
    }
}
