package com.pratice2;

// https://www.nowcoder.com/ta/2019test

import java.util.Scanner;

/**
 * 简单背包问题，当nw较小时可以使用dp，否则递归+剪枝 n小，w大
 * @author: wyh
 * @Date: 2019/10/30 10:50
 */
public class Code7 {

    public static long countNum(int n, long w, long[] v){
        if(n==0||w==0){
            return 1;
        }
        if(w-v[n-1]>=0){
            return countNum(n-1, w, v) + countNum(n-1, w-v[n-1], v);
        }else{
            return countNum(n-1, w, v);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long w= scanner.nextInt();
        long[] v = new long[n];
        long sum=0;
        for(int i=0;i<n;i++){
            v[i] = scanner.nextInt();
            sum+=v[i];
        }
        if(sum<=w){
            System.out.println((long)Math.pow(2,n));
        }else{
            System.out.println(countNum(n, w, v));
        }
        scanner.close();
    }
}
