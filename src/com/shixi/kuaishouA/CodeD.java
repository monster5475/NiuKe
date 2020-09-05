package com.shixi.kuaishouA;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author: wyh
 * @Day: 2020/3/22
 */
public class CodeD {
    public static class Area{
        public int x;
        public int y;
        public long cost;
        public Area(int x, int y, long cost){
            this.x = x;
            this.y = y;
            this.cost = cost;
        }

        @Override
        public String toString() {
            return x+" "+y+" "+cost;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[1001][1001];
        boolean[][] map = new boolean[1001][1001];
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j] = scanner.nextInt();
            }
        }
        long[][] value = new long[1001][1001];
        for(int i=0;i<=n-a;i++){
            for(int j=0;j<=m-b;j++){
                int end_i = i+a;
                int end_j = j+b;
                int min = Integer.MAX_VALUE;
                for(int ii=i;ii<end_i;ii++){
                    for(int jj=j;jj<end_j;jj++){
                        min = Math.min(min, matrix[ii][jj]);
                    }
                }
                long sum=0;
                for(int ii=i;ii<end_i;ii++){
                    for(int jj=j;jj<end_j;jj++){
                        sum+=matrix[ii][jj] - min;
                    }
                }
                value[i][j] = sum;
            }
        }
        List<Area> areas = new ArrayList<>();
        while (true){
            long min = Long.MAX_VALUE;
            int min_i = 0;
            int min_j = 0;
            for(int i=0;i<=n-a;i++){
                for(int j=0;j<=m-b;j++){
                    if(value[i][j]<min){
                        int end_i = i+a;
                        int end_j = j+b;
                        boolean flag = false;
                        for(int ii=i;ii<end_i;ii++){
                            for(int jj=j;jj<end_j;jj++){
                                if(map[ii][jj] == false){
                                    ;
                                }else{
                                    flag = true;
                                    break;
                                }
                            }
                        }
                        if(flag){
                            ;
                        }else {
                            min = value[i][j];
                            min_i = i;
                            min_j = j;
                        }
                    }
                }
            }
            if(min == Long.MAX_VALUE){
                break;
            }else{
                areas.add(new Area(min_i+1, min_j+1, min));
                for(int ii=min_i;ii<min_i+a;ii++){
                    for(int jj=min_j;jj<min_j+b;jj++){
                        map[ii][jj] = true;
                    }
                }
            }
        }
        System.out.println(areas.size());
        areas.stream().forEach(System.out::println);
        scanner.close();
    }
}
