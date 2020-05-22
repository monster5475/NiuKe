package com.likou;

/**
 * @author: wyh
 * 第k个排列
 * @Day: 2020/4/21
 */
public class Code60 {
    public static String getPermutation(int n, int k) {
        String res ="";
        boolean[] flags = new boolean[n];
        int sum=1;
        for(int i=1;i<=n;i++){
            sum*=i;
        }
        int cnt;
        for(int i=0;i<n;i++){
            sum = sum/(n-i);
            if(k>sum){
                cnt = (k-1)/sum;
                k-=cnt*sum;
            }else{
                cnt = 0;
            }
            int count=0;
            for(int j=0;j<n;j++){
                if(!flags[j]){
                    count+=1;
                }
                if(count == cnt+1){
                    flags[j] = true;
                    res+=String.valueOf(j+1);
                    break;
                }
            }
        }
        return res;
    }
}
