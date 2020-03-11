package com.pratice2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * https://www.nowcoder.com/ta/2019test
 * @author: wyh
 * @Date: 2020/2/26 14:14
 */
public class Code15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m;
        m = scanner.nextInt();
        int[] steps = new int [10];
        for(int i=0;i<10;i++){
            steps[i] = (int)Math.pow(2, i);
        }
        int[] taijie = new int[m];
        for(int i=0;i<m;i++){
            taijie[i] = scanner.nextInt();
        }
        Arrays.sort(taijie);
//        for(int i=0;i<m;i++){
//            System.out.println(taijie[i]);
//        }
        long[] dp = new long[1001];
        dp[0]=1;
        for(int i=1;i<=taijie[m-1];i++){
            long count =0;
            for(int j=0; j<10;j++){
                if(i>=steps[j]){
                    count+=dp[i-steps[j]];
                }
                if(count>(Math.pow(10,9) + 3)){
                    count%=(Math.pow(10,9) + 3);
                }
            }
            dp[i] = count;
        }
        for(int i=0;i<m;i++) {

            System.out.println(dp[taijie[i]]);
        }
        scanner.close();
    }
}