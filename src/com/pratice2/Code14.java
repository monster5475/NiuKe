package com.pratice2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * https://www.nowcoder.com/ta/2019test
 * @author: wyh
 * @Date: 2019/10/30 10:50
 */
public class Code14 {
    public static class Jimu{
        public int length;
        public int width;

        public Jimu(int length, int width){
            this.length = length;
            this.width = width;
        }

        @Override
        public String toString() {
            return length + ", " + width;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        n = scanner.nextInt();
        Jimu[] jimus = new Jimu[n];
        int l = 0, w =0;
        for (int i=0;i<n;i++){
            int length = scanner.nextInt();
            int width = scanner.nextInt();
            jimus[i] = new Jimu(length, width);
        }
        Arrays.sort(jimus,(jimu1,jimu2)->{
            if(jimu1.width>jimu2.width){
                return 1;
            }else if(jimu1.width<jimu2.width){
                return -1;
            }else if(jimu1.length>=jimu2.length){
                return 1;
            }else {
                return -1;
            }
        });
        int[] dp = new int[n];
        dp[0] = 1;
        for(int i=1;i<n;i++){
            boolean flag = false;
            for(int j=0;j<i;j++) {
                if (jimus[i].length >= jimus[j].length) {
                    dp[i] = dp[j] + 1;
                    flag=true;
                }
            }
            if(!flag){
                dp[i]=1;
            }
        }
        System.out.println(dp[n-1]);
        scanner.close();
    }
}