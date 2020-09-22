package com.likou;

/**
 * @author: wyh
 * 隔空插树苗
 * @Date: 2020/9/22 17:16
 */
public class Code605 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int length = flowerbed.length;
        int[] newF = new int[length+2];
        newF[0] = 0;
        newF[length+1]=0;
        for(int i = 0; i<length;i++){
            newF[i+1] = flowerbed[i];
        }
        int cnt=0, sum=0;
        for(int i=0;i<length+2;i++){
            if(newF[i]==0){
                cnt+=1;
            }else{
                cnt=0;
            }
            if (cnt == 3) {
                sum+=1;
                cnt=1;
            }
        }
        return sum >= n;
    }
}
