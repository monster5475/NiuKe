package com.pratice2;

import java.util.Scanner;

/**
 * @author: wyh
 * 解析加减法运算
 * @Day: 2020/3/7
 */
public class Code25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int length = str.length();
        int result = 0;
        int seq=1;
        String number="";
        for(int i=0; i<length; i++){
            char ch = str.charAt(i);
            if(ch == '-'){
                seq= -1;
            }else if (ch=='+'){
                seq=1;
            }else {
                number += ch;
                if((i+1==length) || (str.charAt(i+1)=='+') || (str.charAt(i+1)=='-')){
                    result+=seq*Integer.valueOf(number);
                    number="";
                }
            }
        }
        System.out.println(result);
        scanner.close();
    }
}
