package com.pratice2;

import java.util.Scanner;

/**
 * @author: wyh
 * 回文子串
 * @Day: 2020/3/7
 */
public class Code23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int length = str.length();
        int result = 0;
        int[][] dp = new int[length][length];
        for(int i=0;i<length;i++){
            dp[i][i] =1;
        }
        for(int i=1; i<length; i++) {
            for(int j=0; j<length-i; j++){
                int ii = j;
                int jj = j+i;
                if(str.charAt(ii) == str.charAt(jj)){
                    if(i==1||i==2){
                        dp[ii][jj]=1;
                        result+=1;
                    }else if(dp[ii+1][jj-1]==1){
                        dp[ii][jj]=1;
                        result+=1;
                    }
                }
            }
        }
        System.out.println(result+length);
        scanner.close();
    }
}
