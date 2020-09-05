package com.shixi.zijietiaodong.bishi;


import java.util.HashMap;
import java.util.Scanner;

/**
 * @author: wyh
 * @Day: 2020/3/15
 */
public class Code3 {
    static class CSM{
        public int start_x;
        public int start_y;
        public int end_x;
        public  int end_y;
    }
    public static int[][] matrix = new int[201][201];
    public static int start_x=0,start_y=0,end_x=0,end_y=0;
    public static HashMap<Integer, CSM> hashMap = new HashMap<>();
    public static int height =0, width=0;
    public static int minStep = Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        width = scanner.nextInt();
        height = scanner.nextInt();
        for(int i=0;i<height;i++){
            for(int j=0;j<width;j++){
                int n = scanner.nextInt();
                matrix[i][j] = n;
                if(n==-2){
                    start_x = i;
                    start_y = j;
                }else if(n==-3) {
                    end_x = i;
                    end_y = j;
                }else if(n!=0&&n!=-1){
                    if(hashMap.containsKey(n)){
                        hashMap.get(n).end_x = i;
                        hashMap.get(n).end_y = j;
                    }else {
                        CSM csm = new CSM();
                        csm.start_x = i;
                        csm.start_y = j;
                        hashMap.put(n, csm);
                    }
                }
            }
        }
        map[start_x][start_y]=1;
        runWay(start_x, start_y, 0);
        System.out.println(minStep);
        scanner.close();
    }
    public static int[][] ders= {{-1,0},{1,0},{0,1},{0,-1},{-1,-1}};
    public static int[][] map = new int[201][201];
    public static void runWay(int run_x, int run_y,int step){
        if(run_x==end_x&&run_y==end_y){
            //走到终点
            minStep = Math.min(minStep, step);
            return ;
        }
        int size = 4;
        if(hashMap.containsKey(matrix[run_x][run_y])){
            // 有传送门
            size=5;
            int key = matrix[run_x][run_y];
            int startx = hashMap.get(key).start_x;
            int starty = hashMap.get(key).start_y;
            int endx = hashMap.get(key).end_x;
            int endy = hashMap.get(key).end_y;
            if(run_x==startx&&run_y==starty){
                ders[4][0] = endx;
                ders[4][1] = endy;
            }else if(run_x==endx&&run_y==endy) {
                ders[4][0] = startx;
                ders[4][1] = starty;
            }
        }
        for(int i=0;i<size;i++){
            int next_x = run_x+ders[i][0];
            int next_y = run_y+ders[i][1];
            if(next_x<0||next_x>=height||next_y<0||next_y>=width||matrix[next_x][next_y]==-1||map[next_x][next_y]==1){
                //超出范围
                continue;
            }else {
                map[next_x][next_y] = 1;
                runWay(next_x, next_y, step + 1);
                map[next_x][next_y] = 0;
            }
        }
    }
}
