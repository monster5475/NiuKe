package com.likou.Code1_49;

/**
 * @author: wyh
 * 旋转图像
 * @Day: 2020/4/5
 */
public class Code48 {
    public static void rotate(int[][] matrix) {
        int length = matrix.length;
        int length_i = length/2;
        for(int i=0;i<length_i;i++){
            int length_j = length - i*2;
            int x_up = i, y_up=i;
            int x_right = i, y_right=length_j-1+i;
            int x_down = length_j-1+i, y_down=length_j-1+i;
            int x_left = length_j-1+i, y_left=i;
            for(int j=i;j<i+length_j-1;j++){
                int dis = j-i;
                int t = matrix[i][j];
                matrix[i][j] = matrix[x_left-dis][y_left];
                matrix[x_left-dis][y_left] = matrix[x_down][y_down-dis];
                matrix[x_down][y_down-dis] = matrix[x_right + dis][y_right];
                matrix[x_right + dis][y_right] = t;
            }
        }
    }
}
