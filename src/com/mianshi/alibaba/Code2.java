package com.mianshi.alibaba;

import java.util.Scanner;

/**
 * @author: wyh
 * @Day: 2020/3/25
 */
public class Code2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int q = scanner.nextInt();
        int[][] matrix = new int[n][m+2];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j] = scanner.nextInt();
            }
        }
        int[][] querys = new int[q][2];
        for(int i=0;i<q;i++){
            querys[i][0] = scanner.nextInt();
            querys[i][1] = scanner.nextInt();
        }
        int left =-1;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]!=0){
                    if(left!=-1){
                        matrix[i][m] = Math.abs(matrix[i][left] - matrix[i][j]) / (left-j);
                        matrix[i][m+1] = left;
                        break;
                    }
                    left = j;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][m]!=0){
                    matrix[i][j] = matrix[i][m+1]+ (j-left) * matrix[i][m];
                }
            }
        }
        for(int i=0;i<q;i++){
            if(matrix[querys[i][0]][querys[i][1]]!=0){
                System.out.println(matrix[querys[i][0]][querys[i][1]]);
            }else{
                System.out.println("Unknown");
            }
        }
        scanner.close();
    }
}
