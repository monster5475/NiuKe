package com.shixi.baidu;

import java.util.Scanner;

/**
 * @author: wyh
 * 最小公倍数与最大公约数
 * @Day: 2020/3/29
 */
public class Code1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        System.out.println(n*(n-1)-1);
        scanner.close();
    }
}
