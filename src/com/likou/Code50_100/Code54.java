package com.likou.Code50_100;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: wyh
 * 螺旋矩阵
 * @Day: 2020/4/16
 */
public class Code54 {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int length = matrix.length;
        if(length==0){
            return result;
        }
        int width = matrix[0].length;
        boolean[][] flags = new boolean[length][width];
        int start_i=0, start_j=0;
        int[][] directs = {{0,1},{1,0},{0,-1},{-1,0}};
        int direct = 0;
        int count=0;
        result.add(matrix[0][0]);
        flags[0][0] = true;
        while (true){
            if(start_i+directs[direct][0]>=0 && start_i+directs[direct][0]<length
                    &&start_j+directs[direct][1]>=0&& start_j+directs[direct][1]<width
                    && !flags[start_i+directs[direct][0]][start_j+directs[direct][1]]){
                count=0;
            }else{
                direct+=1;
                direct%=4;
                count+=1;
                if(count>=4){
                    break;
                }
            }
            if(count==0){
                start_i= start_i+directs[direct][0];
                start_j = start_j+directs[direct][1];
                flags[start_i][start_j] = true;
                result.add(matrix[start_i][start_j]);
            }
        }
        return result;
    }
}
