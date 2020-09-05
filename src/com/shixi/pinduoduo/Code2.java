package com.shixi.pinduoduo;

import java.util.Scanner;

/**
 * @author: wyh
 * @Day: 2020/4/10
 */
public class Code2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] trees = new int[n];
        for(int i=0;i<n;i++){
            trees[i] = scanner.nextInt();
        }
        long sum, count=0;
        for(int i=0;i<n;i++){
            sum=0;
            for(int j=i;j<n;j++){
                sum+=trees[j];
                if(sum%m==0){
                    count+=1;
                }
            }
        }
        System.out.println(count);
        scanner.close();
    }
}
