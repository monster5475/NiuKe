package com.pratice2;

import java.util.Scanner;

/**
 * @author: wyh
 * 鸡鸭分类问题
 * @Day: 2020/3/8
 */
public class Code32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int length = str.length();
        boolean flag = false;
        int sum=0, count=0;
        for(int i=0;i<length;i++){
            if(flag && str.charAt(i)=='C'){
                sum+=count;
            }
            if(str.charAt(i)=='D'){
                flag = true;
                count+=1;
            }
        }
        System.out.println(sum);
        scanner.close();
    }
}
