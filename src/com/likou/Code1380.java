package com.likou;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: wyh
 * 水题
 * @Day: 2020/9/10
 */
public class Code1380 {
    public List<Integer> luckyNumbers (int[][] matrix) {
        int length = matrix.length;
        int width = matrix[0].length;
        List<Integer> result= new ArrayList<>();
        int[][] maps = new int[length+1][width+1];
        for(int i=0;i<length;i++){
            int rmax= Integer.MAX_VALUE;
            for(int j=0;j<width;j++){
                rmax = Math.min(rmax, matrix[i][j]);
            }
            maps[i][width] = rmax;
        }
        for(int i=0;i<width;i++){
            int rmax= 0;
            for(int j=0;j<length;j++){
                rmax = Math.max(rmax, matrix[j][i]);
            }
            maps[length][i] = rmax;
        }
        for(int i=0;i<length;i++){
            for(int j=0;j<width;j++){
                if(matrix[i][j]==maps[i][width] && matrix[i][j]==maps[length][j]){
                    result.add(matrix[i][j]);
                }
            }
        }
        return result;
    }
}
