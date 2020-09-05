package com.shixi.wangyi;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @author: wyh
 * @Day: 2020/4/7
 */
public class Code4 {
    public static class Point{
        public int x;
        public int y;
        public int step;
        public Point(int x, int y,int step){
            this.x = x;
            this.y = y;
            this.step = step;
        }
    }

    public static int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};

    public static int bfs(int i,int j,int[][]map){
        boolean[][] biaoji = new boolean[map.length][map[0].length];
        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(i,j,0));
        while(!queue.isEmpty()){
            Point point = queue.poll();
            for(int k=0;k<dirs.length;k++){
                int i_ = point.x+dirs[k][0];
                int j_ = point.y+dirs[k][1];
                if(i_>=0&&i_<map.length&&j_>=0&&j_<map[0].length) {
                    if (map[i_][j_] == 0){
                        return point.step;
                    }
                    if (biaoji[i_][j_] == false) {
                        queue.add(new Point(i_, j_,point.step+1));
                    }
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] ss = s.split(" ");
        int n = Integer.valueOf(ss[0]);
        int m = Integer.valueOf(ss[1]);
        int[][] map = new int[1001][1001];
        int[][] result = new int[1001][1001];
        for(int i=0;i<n;i++){
            String str = scanner.nextLine();
            for(int j=0;j<m;j++){
                map[i][j] = str.charAt(j) - '0';
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(map[i][j] == 0){
                    result[i][j] =0;
                }else{
                    result[i][j] = bfs(i,j,map);
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(result[i][j]);
                if(j!=m-1){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        scanner.close();
    }
}
