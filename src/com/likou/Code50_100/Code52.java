package com.likou.Code50_100;

/**
 * @author: wyh
 * @Day: 2020/4/16
 */
public class Code52 {
    public static int count;
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
            count+=1;
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

    public static int totalNQueens(int n) {
        char[][] map = new char[n][n];
        count=0;
        nn = n;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                map[i][j] = '.';
            }
        }
        queens(map, 0);
        return count;
    }
}
