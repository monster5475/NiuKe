package com.pratice1;

import sun.security.util.Length;

import java.lang.reflect.Array;
import java.util.stream.Collectors;
import java.util.*;
import java.util.stream.Stream;

/**
 * @author: wyh
 *
 * @Date: 2019/9/3 13:04
 */


public class MyMain {

    public int sumByOne(int num){
        int sum=0;
        while(num>0){
            sum+=num%10;
            num = num/10;
        }
        return sum;
    }

    public int movingCount(int threshold, int rows, int cols)
    {
        int[][] flag=new int[rows][cols];
        int count =0;
        for(int i=0; i<rows; i++){
            int ii=sumByOne(i);
            for(int j=0; j<cols; j++){
                int jj=sumByOne(j);
                if(ii+jj<=threshold){
                    count +=1;
                    flag[i][j] +=1;
                }
            }
        }
        for(int i=0; i<cols; i++){
            int ii=sumByOne(i);
            for(int j=0; j<rows; j++){
                int jj=sumByOne(j);
                if(ii+jj<=threshold){
                    count +=1;
                    flag[j][i] +=1;
                }
                else{
                    break;
                }
            }
        }
        for(int i=cols-1; i>=0; i--){
            int ii=sumByOne(i);
            for(int j=rows-1; j>=0; j--){
                int jj=sumByOne(j);
                if(ii+jj<=threshold){
                    count +=1;
                    flag[j][i] +=1;
                }
                else{
                    break;
                }
            }
        }
        for(int i=rows-1; i>=0; i--){
            int ii=sumByOne(i);
            for(int j=cols-1; j>=0; j--){
                int jj=sumByOne(j);
                if(ii+jj<=threshold){
                    count +=1;
                    flag[i][j] +=1;
                }
                else{
                    break;
                }
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(flag[i][j]==4){
                    count -=3;
                }else if(flag[i][j]==3){
                    count -=2;
                }else if(flag[i][j]==2){
                    count -=1;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        MyMain myMain = new MyMain();
        System.out.println(myMain.movingCount(15,20,20));
    }
}
