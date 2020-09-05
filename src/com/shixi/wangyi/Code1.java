package com.shixi.wangyi;

import java.util.Scanner;

/**
 * @author: wyh
 * @Day: 2020/4/7
 */
public class Code1 {
    public static long update(long a, long b){
        if(a<=0||b<=0){
            return -1;
        }
        if(a==b){
            return a;
        }
        long max = Math.max(a,b), min = Math.min(a, b);
        long t;
        while(max%min!=0){
            t = min;
            min = max%min;
            max = t;
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long min1,min2, d_;
        if(n==2){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println(Math.max(a,b)-Math.min(a,b));
            return;
        }
        long x = scanner.nextLong();
        long y = scanner.nextLong();
        min1 = y-x;
        min2 = Integer.MAX_VALUE;
        for(int i=2;i<n;i++){
            x = scanner.nextLong();
            d_ = x-y;
            y = x;
            min1 = update(min1, d_);
//            if(d_<min2){
//                min2 = d_;
//                min1 = Math.min(min1,min2);
//                min2 = Math.max(min2, min1);
//            }
        }
        System.out.println(min1);
        scanner.close();
    }
}
