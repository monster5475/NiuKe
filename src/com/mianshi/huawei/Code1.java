package com.mianshi.huawei;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author: wyh
 * @Day: 2020/4/8
 */
public class Code1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int l = scanner.nextInt();
            if(n==0&&l==0){
                break;
            }
            BigInteger sum = BigInteger.valueOf(0);
            long ln =(long) (Math.pow(10,9)+7);
            BigInteger s = BigInteger.valueOf(ln);
            for (int i = 1; i <= l; i++) {
                BigInteger bn = BigInteger.valueOf(n);
                BigInteger bt = bn.pow(i);
                bt = bt.mod(s);
                sum = sum.add(bt);
                sum = sum.mod(s);
            }
            System.out.println(sum.intValue());
        }
        scanner.close();
    }
}
