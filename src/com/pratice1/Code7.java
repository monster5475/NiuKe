package com.pratice1;

/**
 * @author: wyh
 * 斐波那契数列
 * @Date: 2019/9/3 14:10
 */
public class Code7 {
    public int Fibonacci(int n) {
        int res = 0;
        if(n==0){res = 0;}
        if(n==1){res = 1;}
        if(n==2){res = 1;}
        if(n>2){res = Fibonacci(n-1) + Fibonacci(n-2);}
        return res;
    }
    public static void main(String[] args) {
        Code7 myMain = new Code7();
        int index = myMain.Fibonacci(38);
        System.out.println(index);
    }
}
