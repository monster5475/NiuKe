package com.mianshi.wangyihuyu;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author: wyh
 * @Day: 2020/4/11
 */
public class Code2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] workers = new int[n];
        int[] tasks = new int[n];
        for(int i=0;i<n;i++){
            workers[i] = scanner.nextInt();
        }
        for(int i=0;i<n;i++){
            tasks[i] = scanner.nextInt();
        }
        int m =scanner.nextInt();
        Arrays.sort(workers);
        Arrays.sort(tasks);
        long sum = 1;
        int j=0;
        int count=0;
        for(int i=0;i<n;i++){
            while(j<n){
                if(workers[i]>=tasks[j]){
                    count+=1;
                }else{
                    break;
                }
                j++;
            }
            sum*=(count-i);
            sum = sum%m;
        }
        System.out.println(sum);
        scanner.close();
    }
}
