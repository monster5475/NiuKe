package com.pratice2;

import java.util.Scanner;

/**
 * @author: wyh
 * 数字序列第n位的值
 * @Day: 2020/3/7
 */
public class Code29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int result = (int)Math.ceil(Math.sqrt(number*2+0.25)-0.5);
        System.out.println(result);
        scanner.close();
    }
}
