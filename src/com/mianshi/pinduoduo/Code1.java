package com.mianshi.pinduoduo;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author: wyh
 * @Day: 2020/4/10
 */
public class Code1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] goods = new int[n];
        for(int i=0;i<n;i++){
            goods[i] = scanner.nextInt();
        }
        Arrays.sort(goods);
        int count=0;
        long sum=0;
        for(int i=n-1;i>=0;i--){
            count+=1;
            if(count==3){
                count=0;
            }else{
                sum+=goods[i];
            }
        }
        System.out.println(sum);
        scanner.close();
    }
}
