package com.pratice2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 俄罗斯方块
 * @author: wyh
 * @Date: 2019/10/30 10:50
 */
public class Code8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), m= scanner.nextInt();
        int[] pos = new int[n];
        for(int i=0;i<n;i++){pos[i]=0;}
        for(int i=0;i<m;i++){
            pos[scanner.nextInt()-1]+=1;
        }
        int score = Arrays.stream(pos).min().getAsInt();
        System.out.println(score);
        scanner.close();
    }
}
