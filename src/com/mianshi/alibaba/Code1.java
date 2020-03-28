package com.mianshi.alibaba;

import java.util.Scanner;

/**
 * @author: wyh
 * @Day: 2020/3/25
 */
public class Code1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[3];
        int[] new_numbers = new int[3];
        int[][] matrix = new int[3][n];
        for(int i=0;i<3;i++){
            for(int j=0;j<n;j++){
                matrix[i][j] = scanner.nextInt();
            }
        }
        int min;
        for(int i=1;i<n;i++){
            for(int j=0;j<3;j++) {
                min = Integer.MAX_VALUE;
                for (int k = 0; k < 3; k++) {
                    int t = Math.abs(matrix[k][i - 1] - matrix[j][i]) + numbers[k];
                    min = Math.min(min, t);
                }
                new_numbers[j] = min;
            }
            for(int j=0;j<3;j++){
                numbers[j] = new_numbers[j];
            }
        }
        min = Integer.MAX_VALUE;
        for(int i=0;i<3;i++){
            min = Math.min(min, numbers[i]);
        }
        System.out.println(min);
        scanner.close();
    }
}
