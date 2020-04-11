package com.likou.Code1_40;

/**
 * @author: wyh
 * 整数反转
 * @Day: 2020/3/13
 */
public class Code7 {
    public static int reverse(int x) {
        int t=1;
        long x_ = x;
        if(x<0){
            t=-1;
            x_*=t;
        }
        String ss = String.valueOf(x_);
        String num_ = new StringBuilder(ss).reverse().toString();
        long n = Long.valueOf(num_);
        if(n>Integer.MAX_VALUE){
            n=0;
            t=1;
        }
        if(t==-1){
            n*=-1;
        }
        return (int)n;
    }
}
