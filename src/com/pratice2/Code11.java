package com.pratice2;

import java.util.Collections;
import java.util.Scanner;

/**
 * @author: wyh
 * @Date: 2020/1/3 14:15
 */

public class Code11 {

    /**
     * 组合数求解
     * @param n
     * @param m
     * @return
     */
    public static long combine(int n, int m, long target){
        if(m==0||n==0) {
            return 1;
        }
        long k=1;
        for (int i=0;i<m-n;i++){
            k *= n+i+1;
            k /= (i+1);
            if(k>target){
                break;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n,m;
        long k;
        long res=0;
        n = scanner.nextInt();
        m = scanner.nextInt();
        k = scanner.nextLong();
        long target = k;
        String resStr="";
        int tm = m;
        int tn = n;
        resStr ="";
        while(tm>0&&tn>0){
            long limit = combine(tm, tm+tn-1, target);
            if(target>limit){
                target-=limit;
                tm-=1;
                resStr+="z";
            }else{
                tn-=1;
                resStr+="a";
            }
        }
        if(tm!=0){
            resStr+=String.join("", Collections.nCopies(tm, "z"));
        }
        if(tn!=0){
            resStr+=String.join("", Collections.nCopies(tn, "a"));
        }
        if(target != 1){
            System.out.println(-1);
        }else{
            System.out.println(resStr);
        }

        scanner.close();
    }
}

