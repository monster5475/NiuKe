package com.pratice2;

import java.util.Scanner;

/**
 * @author: wyh
 * X游戏
 * @Day: 2020/3/8
 */
public class Code35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int n = number;
        String[] numbers = {"2", "5", "6", "9"};
        int sum = 0;
        for(int i=1; i<=n;i++){
            String str = String.valueOf(i);
            boolean flag = false;
            for(int j=0;j<numbers.length;j++){
                if (str.indexOf(numbers[j])!=-1){
                    if(str.indexOf("3")==-1&&str.indexOf("4")==-1&&str.indexOf("7")==-1) {
                        flag = true;
                        break;
                    }
                }
            }
            if(flag){
                sum+=1;
            }
        }
        System.out.println(sum);
        scanner.close();
    }
}
