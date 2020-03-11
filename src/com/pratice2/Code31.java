package com.pratice2;

import java.util.Scanner;

/**
 * @author: wyh
 * 最小代价爬楼梯
 * @Day: 2020/3/7
 */
public class Code31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        String[] costs = str.split(",");
        int length = costs.length;
        int[] costs_ = new int[length];
        for(int i=0;i<length;i++){
            costs_[i] = Integer.valueOf(costs[i]);
        }
        int[] dp = new int[length];
        dp[0] = costs_[0];
        dp[1] = costs_[1];
        for(int i=2;i<length;i++){
            dp[i] = Math.min(dp[i-1], dp[i-2]) + costs_[i];
        }
        System.out.println(Math.min(dp[length - 1], dp[length-2]));
        scanner.close();
    }
}
