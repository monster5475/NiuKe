package com.shixi.huawei;

import java.util.Scanner;

/**
 * @author: wyh
 * @Day: 2020/4/8
 */
public class Code3 {
    public static boolean[][] row;
    public static boolean[][] columns;
    public static boolean[][] boxes;

    public static void initMaps(int[][]map){
        row = new boolean[9][10];
        columns = new boolean[9][10];
        boxes = new boolean[9][10];
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                int box = i/3*3+j/3;
                if(map[i][j]!=0){
                    row[i][map[i][j]] = true;
                    columns[j][map[i][j]] = true;
                    boxes[box][map[i][j]] =true;
                }
            }
        }
    }

    public static boolean jieshudu(int[][] map, int i, int j){
        if(j==9){
            i+=1;
            j=0;
            if(i==9){
                return true;
            }
        }
        int box = i/3*3+j/3;
        if(map[i][j]==0){
            for(int k=1;k<=9;k++){
                if(row[i][k] == false && columns[j][k] == false &&boxes[box][k] == false){
                    map[i][j] = k;
                    row[i][k] = true;
                    columns[j][k] = true;
                    boxes[box][k] = true;
                    if(jieshudu(map, i, j+1)){
                        return true;
                    }
                    map[i][j] = 0;
                    row[i][k] = false;
                    columns[j][k] = false;
                    boxes[box][k] = false;
                }
            }
        }else{
            return jieshudu(map, i, j+1);
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[][] map = new int[9][9];
        String[] strs = new String[9];
        for(int i=0;i<9;i++){
            strs[i] = scanner.nextLine();
        }
        for(int i=0;i<9;i++){
            String[] ss = strs[i].substring(1,strs[i].length()-1).split(",");
            for(int j=0;j<ss.length;j++){
                map[i][j] = Integer.valueOf(ss[j]);
            }
        }
        initMaps(map);
        jieshudu(map,0 ,0);
        for(int i=0;i<9;i++){
            System.out.print("{");
            for(int j=0;j<9;j++){
                System.out.print(map[i][j]);
                if(j!=8){
                    System.out.print(",");
                }
            }
            System.out.print("}");
            System.out.println();
        }
        scanner.close();
    }
}
