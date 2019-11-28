package com.pratice2;


import java.util.Scanner;

/**
 * 瞌睡 使用累加数组 解决再for一次
 * @author: wyh
 * @Date: 2019/10/30 10:50
 */
public class Code9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), k= scanner.nextInt();
        int[] scores = new int[n];
        for(int i=0;i<n;i++){
            scores[i]=scanner.nextInt();
        }
        int score=0;
        int[] sleep = new int[n];
        for(int i=0;i<n;i++){
            sleep[i]=scanner.nextInt();
            if(sleep[i]==1){
                score+=scores[i];
            }
        }
        int cnt = 0;
        for(int i=0;i<n&&i<k;i++){
            if(sleep[i]==0){
                cnt+=scores[i];
            }
        }
        int max = cnt;
        for(int i=1;i<n-k;i++){
            if(sleep[i-1]==0){
                cnt-=scores[i-1];
            }
            if(sleep[i+k-1]==0){
                cnt+=scores[i+k-1];
            }
            max = Math.max(max, cnt);
        }
        score += max;
        System.out.println(score);
        scanner.close();
    }
}
