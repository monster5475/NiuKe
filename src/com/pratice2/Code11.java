package com.pratice2;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author: wyh
 * @Date: 2019/10/30 10:50
 */
public class Code11 {

    static class Point{
        public double x;
        public double y;
        public double a;
        public double b;
        public int iter;
        public Point(double a,double b,double x,double y){
            this.x = x;
            this.y = y;
            this.a = a;
            this.b = b;
        }
        public Point(double a,double b,int iter){
            this.a = a;
            this.b = b;
            this.iter = iter;
        }
        public Point[] getPoints(){
            Point[] points = new Point[4];
            int[] sins ={0,1,0,-1};
            int[] coss ={1,0,-1,0};
            for(int i=0;i<4;i++) {
                double newA = (a-x) * coss[i] - (b-y)*sins[i] + x;
                double newB = (a-x) * sins[i] + (b-y)*coss[i] + y;
                points[i] = new Point(newA, newB, i);
            }
            return points;
        }
    }

    public static double getDistance(Point p1, Point p2){
        return Math.pow((p1.a-p2.a),2)+Math.pow((p1.b-p2.b),2);
    }

    public static boolean confirm(Point[] points){
        double[]  length ={getDistance(points[0],points[1]),getDistance(points[0],points[2]),
                getDistance(points[0],points[3]),getDistance(points[1],points[2]),getDistance(points[3],points[1]),
                getDistance(points[2],points[3])};
        Arrays.sort(length);
        if(length[0]!=0&&length[0]==length[1]&&length[1]==length[2]&&length[2]==length[3]&&length[3]==length[0]&&length[4]==length[5]){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Point[][] points = new Point[n][4];
        double a, b, x, y;
        for(int i=0;i<n;i++){
            for(int j=0;j<4;j++) {
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                x = scanner.nextDouble();
                y = scanner.nextDouble();
                Point point = new Point(a, b, x, y);
                points[i][j] = point;
            }
        }
        scanner.close();
        for(int i=0;i<n;i++){
            Point point0 = points[i][0];
            Point point1 = points[i][1];
            Point point2 = points[i][2];
            Point point3 = points[i][3];
            Point[] points0 = point0.getPoints();
            Point[] points1 = point1.getPoints();
            Point[] points2 = point2.getPoints();
            Point[] points3 = point3.getPoints();
            int iters = Integer.MAX_VALUE;
            for(int j=0;j<Math.pow(2,8);j++){
                int[] numbers = new int[8];
                int cnt = 0;
                int t=j;
                while(t>0){
                    numbers[cnt++] = t%2;
                    t/=2;
                }
                Point[] newPoint = new Point[4];
                int index = numbers[0] + 2 * numbers[1];
                newPoint[0] = points0[index];
                index = numbers[2] + 2 * numbers[3];
                newPoint[1] = points1[index];
                index = numbers[4] + 2 * numbers[5];
                newPoint[2] = points2[index];
                index = numbers[6] + 2 * numbers[7];
                newPoint[3] = points3[index];
                if(confirm(newPoint)){
                    int cntIter = newPoint[0].iter + newPoint[1].iter + newPoint[2].iter + newPoint[3].iter;
                    iters = Math.min(iters, cntIter);
                }
            }
            if(iters!=Integer.MAX_VALUE){
                System.out.println(iters);
            }else{
                System.out.println(-1);
            }
        }
    }
}
