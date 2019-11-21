package com.pratice1;

/**
 * @author: wyh
 * 孩子们的游戏
 * @Date: 2019/9/21 14:03
 */
public class Code45 {
    public int LastRemaining_Solution(int n, int m) {
        if(n<=0){
            return -1;
        }
        if(n==1){
            return 0;
        }
        boolean[] flag = new boolean[n];
        int count=0;
        int turn =0,cm=0;
        while(count!=n-1){
            if(flag[turn]==false){
                cm++;
            }
            if(cm==m){
                flag[turn] = true;
                cm=0;
                count++;
            }
            turn++;
            if(turn==n){
                turn=0;
            }
        }
        int index =0;
        for(int i=0;i<n;i++){
            if(flag[i]==false){
                index = i;
            }
        }
        return index;
    }
}
