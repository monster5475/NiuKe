package com.pratice1;

/**
 * @author: wyh
 * 构建乘积数组
 * @Date: 2019/9/21 15:01
 */
public class Code49 {
    public int[] multiply(int[] A) {
        int length = A.length;
        int[] B = new int[length];
        for(int i=0;i<length;i++){
            B[i]=1;
        }
        for(int i=0;i<length;i++){
            for(int j=0;j<length;j++){
                if(i==j){
                    ;
                }else{
                    B[j] *=A[i];
                }
            }
        }
        return B;
    }
}
