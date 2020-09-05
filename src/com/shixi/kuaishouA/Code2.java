package com.shixi.kuaishouA;

import java.util.Scanner;

/**
 * @author: wyh
 * @Day: 2020/3/15
 */
public class Code2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        String[] strings = new String[n];
        for(int i=0;i<n;i++){
            strings[i] = scanner.next();
        }
        int[] courses = new int[m];
        for(int i=0;i<m;i++){
            courses[i] = scanner.nextInt();
        }
        int[] count = new int[5];
        int score = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                count[strings[j].charAt(i)-'A']+=1;
            }
            int max = 0;
            for(int j=0;j<5;j++){
                max = Math.max(max, count[j]);
                count[j] = 0;
            }
            score += courses[i]*max;
        }
        System.out.println(score);
        scanner.close();
    }
}
