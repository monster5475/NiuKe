package com.mianshi.wangyihuyu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author: wyh
 * @Day: 2020/4/11
 */
public class Code3 {
    public static class GUIZE{
        public char p1;
        public boolean state;
        public char p2;
        public GUIZE(char p1, char p2, boolean state){
            this.p1 = p1;
            this.p2 =p2;
            this.state = state;
        }
    }

    public static char[][] peoples;
    public static List<GUIZE> guizes;
    public static int n;
    public static int m;
    public static char[][] lastRes;

    public static boolean yanzheng(char[][] res){
        for(GUIZE guize:guizes){
            if(guize.state == false){
                for(int i=0;i<m;i++){
                    String str = "";
                    for(int j=0;j<n;j++){
                        if(res[i][j]!=' ') {
                            str += res[i][j];
                        }
                    }
                    if(str.contains(String.valueOf(guize.p1))&&str.contains(String.valueOf(guize.p2))){
                        return false;
                    }
                }
            }
        }
        return true;
    }
    public static boolean lastyanzheng(char[][] res){
        for(GUIZE guize:guizes){
            if(guize.state == true){
                for(int i=0;i<m;i++){
                    String str = "";
                    for(int j=0;j<n;j++){
                        str += res[i][j];
                    }
                    if(str.contains(String.valueOf(guize.p1))&&str.contains(String.valueOf(guize.p2))){
                        break;
                    }else{
                        return false;
                    }
                }

            }
        }
        return true;
    }

    public static boolean digui(int team_no, int team_zhiye_no, char[][] res, boolean[][] flags){
        if(team_zhiye_no == n){
            team_no+=1;
            team_zhiye_no = 0;
        }
        if(team_no==m){
            if(lastyanzheng(res)) {
                lastRes = res;
                return true;
            }else{
                return false;
            }
        }
        for(int i=0;i<m;i++) {
            if(flags[team_zhiye_no][i] == false) {
                res[team_no][team_zhiye_no] = peoples[team_zhiye_no][i];
                flags[team_zhiye_no][i] = true;
                if(yanzheng(res)) {
                    if (digui(team_no, team_zhiye_no + 1, res, flags)) {
                        return true;
                    }
                }
                res[team_no][team_zhiye_no] = ' ';
                flags[team_zhiye_no][i] = false;
            }
        }
        return false;
    }

    public static char[][] initRes(char[][] teams, List<GUIZE> guizes){
        for(GUIZE guize:guizes){
            if(guize.state){

            }
        }
        return teams;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        peoples = new char[n][m];
        for(int i=0;i<n;i++){
            String str = scanner.next();
            for(int j=0;j<m;j++){
                peoples[i][j] = str.charAt(j);
            }
        }
        guizes = new ArrayList<>();
        while (true){
            int zhiye1 = scanner.nextInt();
            int no1 = scanner.nextInt();
            boolean state;
            String str = scanner.next();
            int zhiye2 = scanner.nextInt();
            int no2 = scanner.nextInt();
            if(zhiye1==0 &&zhiye2==0 && str.equals("N") && no1==0 && no2==0){
                break;
            }
            if(str.equals("N")){
                state = false;
            }else{
                state = true;
            }
            guizes.add(new GUIZE(peoples[zhiye1-1][no1-1], peoples[zhiye2-1][no2-1],state));
        }
        char[][] teams = new char[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                teams[i][j] = ' ';
            }
        }
        boolean[][] flags = new boolean[n][m];
        digui(0,0,teams,flags);
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(lastRes[i][j]);
            }
            System.out.println();
        }
        scanner.close();
    }
}
