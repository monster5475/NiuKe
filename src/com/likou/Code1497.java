package com.likou;

/**
 * @author: wyh
 * 取余计数法
 * @Day: 2020/9/10
 */
public class Code1497 {
    public static boolean canArrange(int[] arr, int k) {
        int length = arr.length;
        int[] vvs = new int[k];
        for(int i=0;i<length;i++){
            int kk = arr[i]%k;
            if(kk<0){
                vvs[k+kk]+=1;
            }else{
                vvs[kk]+=1;
            }
        }
        if(vvs[0]%2!=0){
            return  false;
        }
        if(k%2==0) {
            if(vvs[k/2]%2!=0){
                return false;
            }
        }
        for(int i=1;i<(k+1)/2;i++){
            if(vvs[i]!=vvs[k-i]){
                return false;
            }
        }

        return true;
    }
}
