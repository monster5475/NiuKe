package com.pratice1;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @author: wyh
 * @Date: 2019/10/28 10:58
 */
public class Code51 {
    public static final class MyPoint{
        public int x;
        public int y;
        public MyPoint(int x,int y){
            this.x = x;
            this.y = y;
        }

        public MyPoint add(MyPoint myPoint){
            return new MyPoint(myPoint.x + this.x, myPoint.y + this.y);
        }

        public boolean isLegal(int w, int h){
            if(this.x>=0 && this.x<w && this.y>=0 && this.y<h){
                return true;
            }
            return false;
        }
        public boolean lessThanThreshold(int threshold){
            if(mySum()<=threshold){
                return true;
            }else{
                return false;
            }
        }

        private int mySum(){
            int num = this.x;
            int returnNum = 0;
            while(num>0){
                returnNum += num%10;
                num = num/10;
            }
            num=this.y;
            while(num>0){
                returnNum += num%10;
                num = num/10;
            }
            return returnNum;
        }
    }

    public enum MoveDir{
        UP(0,-1),
        DOWN(0, 1),
        LEFT(-1, 0),
        RIGHT(1, 0);
        public MyPoint myPoint;
        MoveDir(int x, int y){
            this.myPoint = new MyPoint(x,y);
        }
    }

    public int movingCount(int threshold, int rows, int cols)
    {
        if (threshold<=0){
            return 0;
        }
        int countNum = 1;
        boolean[][] map = new boolean[rows][cols];
        Queue<MyPoint> myPoints = new ArrayDeque<>();
        myPoints.add(new MyPoint(0,0));
        map[0][0] = true;
        while(!myPoints.isEmpty()){
            MyPoint myPoint = myPoints.poll();
            for(MoveDir moveDir: MoveDir.values()){
                MyPoint nextPoint = myPoint.add(moveDir.myPoint);
                if(nextPoint.lessThanThreshold(threshold) && nextPoint.isLegal(rows, cols)
                        && map[nextPoint.x][nextPoint.y]==false){
                    map[nextPoint.x][nextPoint.y] = true;
                    countNum+=1;
                    myPoints.add(nextPoint);
                }
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(map[i][j]){
                    System.out.print("* ");
                }else{
                    System.out.print("1 ");
                }
            }
            System.out.println();
        }
        return countNum;
    }
}
