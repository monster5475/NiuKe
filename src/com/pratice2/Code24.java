package com.pratice2;

import java.util.Scanner;

/**
 * @author: wyh
 * 字符串压缩
 * @Day: 2020/3/7
 */
public class Code24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        String result = "";
        int length = str.length();
        int index= 0;
        while(index<length){
            int j = index;
            while((j<length) && (str.charAt(j) == str.charAt(index))){
                j+=1;
            }
            result += String.valueOf(j-index) + str.charAt(index);
            index = j;
        }
        System.out.println(result);
        scanner.close();
    }
}
