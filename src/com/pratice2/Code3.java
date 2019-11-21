package com.pratice2;

import java.util.Scanner;

/**
 * @author: wyh
 * @Day: 2019/11/21
 */
public class Code3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int iter = scanner.nextInt();
        for(int it=0;it<iter;it++){
            int length = scanner.nextInt();
            String load = scanner.next();
            int number = 0;
            int i=0;
            while(i<length){
                if(load.charAt(i)=='.'){
                    number++;
                    i+=3;
                }else{
                    i+=1;
                }
            }
            System.out.println(number);
        }
        scanner.close();
    }
}
