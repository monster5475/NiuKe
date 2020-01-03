package com.pratice2;

import java.util.Scanner;

/**
 * @author: wyh
 * @Date: 2020/1/3 14:32
 */
public class Code12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        n = scanner.nextInt();
        long[] hb = new long[n];
        for(int i=0;i<n;i++){
            hb[i] = scanner.nextInt();
        }
        int begin = 0, end = n-1;
        long sum = 0;
        long hbEnd = hb[end], hbBegin = hb[begin];
        while(end>begin){
            if(hbEnd>hbBegin){
                begin+=1;
                hbBegin+=hb[begin];
            }else if(hbEnd<hbBegin){
                end-=1;
                hbEnd+=hb[end];
            }else{
                sum = hbEnd;
                end-=1;
                hbEnd+=hb[end];
            }
        }
        System.out.println(sum);
        scanner.close();
    }
}
