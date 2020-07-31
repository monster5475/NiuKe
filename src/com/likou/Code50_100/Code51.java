package com.likou.Code50_100;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: wyh
 * n皇后
 * @Day: 2020/4/16
 */
public class Code51 {
    public static List<List<String>> result;
    public static int nn;

    public static boolean check(char[][] map, int i, int layer){
        for(int k=0;k<nn;k++){
            if(map[layer][k]=='.'){
                ;
            }else{
                return false;
            }
        }
        for(int k=0;k<nn;k++){
            if(map[k][i]=='.'){
                ;
            }else{
                return false;
            }
        }
        int ii = layer-1,jj= i-1;
        while(ii>=0&&jj>=0){
            if(map[ii][jj]=='Q'){
                return false;
            }
            ii-=1;
            jj-=1;
        }
        ii = layer-1;
        jj= i+1;
        while(ii>=0&&jj<nn){
            if(map[ii][jj]=='Q'){
                return false;
            }
            ii-=1;
            jj+=1;
        }
        ii = layer+1;
        jj= i+1;
        while(ii<nn&&jj<nn){
            if(map[ii][jj]=='Q'){
                return false;
            }
            ii+=1;
            jj+=1;
        }
        ii = layer+1;
        jj= i-1;
        while(ii<nn&&jj>=0){
            if(map[ii][jj]=='Q'){
                return false;
            }
            ii+=1;
            jj-=1;
        }
        return true;
    }

    public static void queens(char[][] map, int layer){
        if(layer==nn){
            List<String> array = new ArrayList<>();
            for(int i=0;i<nn;i++){
                String res="";
                for(int j=0;j<nn;j++){
                    res+=map[i][j];
                }
                array.add(res);
            }
            result.add(array);
            return;
        }
        for(int i=0;i<nn;i++){
            if(check(map,i,layer)){
                map[layer][i] = 'Q';
                queens(map, layer+1);
                map[layer][i] = '.';
            }
        }
    }

    public static List<List<String>> solveNQueens(int n) {
        char[][] map = new char[n][n];
        nn = n;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                map[i][j] = '.';
            }
        }
        result = new ArrayList<>();
        queens(map, 0);
        return result;
    }
}
