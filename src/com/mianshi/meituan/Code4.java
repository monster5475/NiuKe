package com.mianshi.meituan;

import java.util.Scanner;

/**
 * @author: wyh
 * @Day: 2020/3/19
 */
public class Code4 {
    public static void beginRun(boolean[] points, int point, int distance){
        int n = points.length;
        for(int i=0;i<n;i++){
            if(sides[point][i]<distance){
                if(points[i] == false) {
                    points[i] = true;
                    beginRun(points, i, distance - sides[point][i]);
                    points[i] = false;
                }
            }else{
                if(points[i] == false) {
                    step += 1;
                }
            }
        }
    }

    public static int[][] sides;
    public static int step;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int s = scanner.nextInt();
        int[] points = new int[n];
        int start, end, weight;
        sides = new int[n][n];
        int sum = 0;
        step = 0;
        for(int i=0;i<m;i++){
            start = scanner.nextInt();
            end = scanner.nextInt();
            weight = scanner.nextInt();
            sides[start-1][end-1] = weight;
            sides[end-1][start-1] = weight;
            sum+=weight;
        }
        int k = scanner.nextInt();
        if(sum<k){
            System.out.println(0);
        }else{
            boolean[] p = new boolean[points.length];
            p[s-1] = true;
            beginRun(p, s-1, k);
            System.out.println(step);
        }
        scanner.close();
    }
}
