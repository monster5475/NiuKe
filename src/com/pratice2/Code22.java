package com.pratice2;

import java.util.Scanner;

/**
 * @author: wyh
 * 最少数量货物装箱问题
 * @Day: 2020/3/7
 */
public class Code22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int weight = scanner.nextInt();
        int num2=weight/3;
        int number_goods=Integer.MAX_VALUE;
        for(int i=0;i<=num2;i++){
            int weight1 = weight - i*3;
            int num1 = weight1/5;
            for(int j=0;j<=num1;j++){
                int weight2= weight1-j*5;
                int num0 = weight2/7;
                int num_ = weight2%7;
                if(num_==0){
                    number_goods = Math.min(number_goods, i+j+num0);
                }
            }
        }
        if(number_goods!=Integer.MAX_VALUE) {
            System.out.println(number_goods);
        }else{
            System.out.println(-1);
        }
        scanner.close();
    }
}
