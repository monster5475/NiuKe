package com.pratice2;

import java.util.Scanner;

/**
 * https://www.nowcoder.com/ta/2019test
 * @author: wyh
 * @Date: 2019/10/30 10:50
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        n = scanner.nextInt();
        int [][] jimu = new int[n][2];
        for (int i=0;i<n;i++){
            jimu[i][0] = scanner.nextInt();
            jimu[i][1] = scanner.nextInt()
        }
        scanner.close();
    }
}