package com.likou;

/**
 * @author: wyh
 * 螺旋矩阵II
 * @Day: 2020/4/21
 */
public class Code59 {
    public static int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int length = matrix.length;
        int width = matrix[0].length;
        boolean[][] flags = new boolean[length][width];
        int start_i=0, start_j=0;
        int[][] directs = {{0,1},{1,0},{0,-1},{-1,0}};
        int direct = 0;
        int count=0;
        matrix[0][0]=1;
        flags[0][0] = true;
        int cnt=2;
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
                matrix[start_i][start_j] = cnt;
                cnt+=1;
            }
        }
        return matrix;
    }

}
