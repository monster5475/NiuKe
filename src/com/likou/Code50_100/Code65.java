package com.likou.Code50_100;

/**
 * @author: wyh
 * 加1
 * @Day: 2020/4/22
 */
public class Code65 {
    public int[] plusOne(int[] digits) {
        int length = digits.length;
        int i=length-1;
        int t=0;
        digits[length-1]+=1;
        while (i>=0){
            digits[i]+=t;
            if(digits[i]>=10){
                digits[i] -= 10;
                t=1;
            }else{
                t=0;
                break;
            }
            i--;
        }
        int[] res;
        if(t==1){
            res = new int[length+1];
            res[0] = 1;
            System.arraycopy(digits,0,res,1,length);
        }else{
            res = new int[length];
            System.arraycopy(digits,0,res,0,length);
        }
        return res;
    }
}
