package com.likou;

/**
 * @Author wyh
 * @Description
 * @Date: 2020 08 13 下午8:37
 */
public class Code1565 {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        int length = matrix.length;
        if(length==0){
            return false;
        }
        int width = matrix[0].length;
        int i = 0,j=width-1;
        boolean flag = false;
        while (i<length && j>=0){
            if(matrix[i][j]<target){
                i+=1;
            }else if(matrix[i][j]== target){
                flag= true;
                break;
            }else{
                j-=1;
            }
        }
        return flag;
    }
}
