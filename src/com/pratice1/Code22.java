package com.pratice1;

/**
 * @author: wyh
 * 二叉搜索树的后序遍历序列
 * @Date: 2019/9/5 14:05
 */
public class Code22 {
    public boolean VerifySquenceOfBST(int [] sequence) {
        int length = sequence.length;
        if(length == 0){
            return false;
        }
        if(length<=2){
            return true;
        }
        int i = -1;
        for(i=length-1;i>=0;i--){
            if(sequence[i]>=sequence[length-1]){
                ;
            }else {
                break;
            }
        }
        int[] left = new int[i+1];
        int index = 0;
        for(int j=0;j<=i;j++){
            if(sequence[j]>sequence[length-1]){
                return false;
            }
            left[index++] = sequence[j];
        }
        int[] right = new int[length-i-2];
        index = 0;
        for(int j=i+1;j<length-1;j++){
            if(sequence[j]<sequence[length-1]){
                return false;
            }
            right[index++] = sequence[j];
        }
        VerifySquenceOfBST(left);
        VerifySquenceOfBST(right);
        return true;
    }
}
