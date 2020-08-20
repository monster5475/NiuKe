package com.likou;

/**
 * @Author wyh
 * @Description 贪心
 * @Date: 2020 08 19 下午2:06
 */
public class Code861 {
    public int matrixScore(int[][] A) {
        int length = A.length;
        int width = A[0].length;
        for(int i=0;i<length;i++){
            if(A[i][0]==0){
                for (int j=0;j<width;j++){
                    A[i][j]^=1;
                }
            }
        }
        for(int j=1;j<width;j++){
            int cnt=0;
            for(int i=0;i<length;i++){
                if(A[i][j]==1){
                    cnt++;
                }
            }
            if(cnt<=length/2){
                for(int i=0;i<length;i++){
                    A[i][j]^=1;
                }
            }
        }
        int sum=0;
        for(int i=0;i<length;i++){
            for(int j=0;j<width;j++){
                sum+=Math.pow(2,width-j-1)*A[i][j];
            }
        }
        return sum;
    }
}
