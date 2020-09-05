package com.shixi.meituan;

import java.util.Scanner;

/**
 * @author: wyh
 * @Day: 2020/3/19
 */
public class Code2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        int[] dp = new int[n];
        int[] ll = new int[n];
        for(int i=0;i<n;i++){
            numbers[i] = scanner.nextInt();
        }
        if(n==0){
            System.out.println(0);
        }else {
            dp[0] = 1;
            ll[0] =1 ;
            for (int i = 1; i < n; i++) {
                if (numbers[i] > numbers[i - 1]) {
                    ll[i] = ll[i-1]+1;
                    dp[i] = dp[i-1] + 1;
                } else if(numbers[i]<=numbers[i-1]){
                    ll[i] = 1;
                    dp[i]=1;
                }
                if (i - 2 >= 0) {
                    if (numbers[i] > numbers[i - 2]) {
                        int min = Math.min(dp[i-2], ll[i-2]);
                        dp[i] = Math.max(dp[i], min + 1);
                    }
                }
            }
            int max = 0;
            for (int i = 0; i < n; i++) {
                max = Math.max(max, dp[i]);
            }
            System.out.println(max);
        }
        scanner.close();
    }
}
