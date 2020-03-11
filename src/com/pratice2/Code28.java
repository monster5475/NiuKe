package com.pratice2;

import java.util.Scanner;

/**
 * @author: wyh
 * 今年的第几天
 * @Day: 2020/3/7
 */
public class Code28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt(), month = scanner.nextInt(), day = scanner.nextInt();
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if(((year%100==0)&&(year%400==0))||((year%100!=0)&&(year%4==0))){
            days[1] = 29;
        }
        int daySum = 0;
        for(int i=0;i<month-1;i++){
            daySum += days[i];
        }
        daySum+=day;
        System.out.println(daySum);
        scanner.close();
    }
}
