package com.pratice2;

import java.util.Scanner;

/**
 * 三个数求最大值
 * @author: wyh
 * @Date: 2019/10/30 10:50
 */
public class Code12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt();
        int max = a+b+c;
        max = Math.max(max, a*b*c);
        max = Math.max(max, a+b*c);
        max = Math.max(max, a*b+c);
        max = Math.max(max, (a+b)*c);
        max = Math.max(max, a*(b+c));
        max = Math.max(max, b*(a+c));
        System.out.println(max);
    }
}
