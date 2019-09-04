package com.pratice1;

import java.util.ArrayList;

/**
 * @author: wyh
 * 顺时针打印矩阵
 * @Day: 2019/9/4
 */
public class Code19 {
    public int[][] reverseArray(int[][] matrix){
        int width = matrix.length -1;
        if(width==0){
            return null;
        }
        int height = matrix[0].length;
        int[][] result = new int[height][width];
        for(int i=height-1;i>=0;i--){
            for(int j=1;j<=width;j++){
                int ii = height-1-i;
                int jj = j-1;
                result[ii][jj]=matrix[j][i];
            }
        }
        return result;
    }

    public ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> result = new ArrayList<>();
        while(matrix!=null){
            for(int i=0;i<matrix[0].length;i++){
                result.add(matrix[0][i]);
            }
            matrix = reverseArray(matrix);
        }
        return result;
    }

}
