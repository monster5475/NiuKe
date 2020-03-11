package com.pratice2;

import java.util.Scanner;

/**
 * @author: wyh
 * @Day: 2020/3/6
 */

public class Code21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String str1 = scanner.next();
            String str2 = scanner.next();
            if(str1.indexOf(str2)!=-1){
                System.out.println(1);
            }else if(str2.indexOf(str1)!=-1){
                System.out.println(1);
            }else{
                System.out.println(0);
            }
        }
        scanner.close();
    }
}