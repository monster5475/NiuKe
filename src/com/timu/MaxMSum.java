package com.timu;

import java.util.Scanner;

/**
 * 最大M子段和
 * @author: wyh
 * @Day: 2020/2/28
 */
public class MaxMSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n,m;
        n = scanner.nextInt();
        m = scanner.nextInt();
        int[] number = new int[n+1];
        for(int i=1;i<n+1;i++){
            number[i] = scanner.nextInt();
        }
        int[] dp_pre = new int[n+1];
        int[] dp_after = new int[n+1];
        for(int i=0;i<=n;i++){
            dp_pre[i]= 0;
            dp_after[i] = 0;
        }
        int maxNumber;
        for(int i=1;i<=m;i++){
            maxNumber = Integer.MIN_VALUE;
            for(int j=i;j<n;j++){
                maxNumber = Math.max(maxNumber, dp_pre[j - 1]);
                dp_after[j] = Math.max(maxNumber, dp_after[j-1]);
                dp_after[j]+=number[j];
                System.out.print(dp_after[j]+" ");

            }
            for(int j=0; j<=n;j++){
                dp_pre[j] = dp_after[j];
                dp_after[j] = Integer.MIN_VALUE;
            }
            System.out.println();
        }
        scanner.close();
    }
}
