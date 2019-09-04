package com.pratice1;

import jdk.nashorn.internal.ir.Flags;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author: wyh
 *
 * @Date: 2019/9/3 13:04
 */
public class MyMain {

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

    public static void main(String[] args) {
        MyMain myMain = new MyMain();
        int[][] matrix = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20}};
        ArrayList<Integer> result = myMain.printMatrix(matrix);
       result.stream().forEach(System.out::print);
    }
}
