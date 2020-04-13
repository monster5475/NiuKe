package com.likou.Code1_49;

/**
 * @author: wyh
 * 两数相除
 * @Day: 2020/3/31
 */
public class Code29 {
    public static int divide(int dividend, int divisor) {
        if(dividend==0){
            return 0;
        }
        if(divisor==1){
            return dividend;
        }
        if(divisor==-1){
            if(dividend == Integer.MIN_VALUE){
                return Integer.MAX_VALUE;
            }else{
                return -dividend;
            }
        }
        int sign =1;
        if((divisor>0&&dividend>0)||(dividend<0&&divisor<0)){
            sign=1;
        }else{
            sign=-1;
        }
        divisor = divisor>0?-divisor:divisor;
        dividend = dividend>0?-dividend:dividend;

        int res =div(dividend, divisor);
        return sign==-1?-res:res;
    }

    public static int div(int a,int b){
        if(a>b){
            return 0;
        }
        int count=1;
        int tb = b;
        while(tb+tb>=a&&tb+tb<0){
            tb+=tb;
            count+=count;
        }
        return div(a-tb, b)+ count;
    }
}
