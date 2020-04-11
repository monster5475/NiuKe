package com.mianshi.wangyi;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 * @author: wyh
 * @Day: 2020/4/7
 */
public class Code3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int f = scanner.nextInt();
        int[] peoples = new int[51];
        boolean[] all_people = new boolean[n];
        int[][] party_peoples = new int[500][51];
        HashMap<Integer, List<Integer>> hashMap = new HashMap<>();
        all_people[f] = true;
        for(int i=0;i<m;i++){
            int q  = scanner.nextInt();
            boolean flag = false;
            for(int j =0;j<q;j++){
                peoples[j] = scanner.nextInt();
                if(all_people[peoples[j]]){
                    flag = true;
                }
            }
            if(flag) {
                for (int j = 0; j < q; j++) {
                    all_people[peoples[j]] = true;
                }
            }
        }
        int count = 0;
        for(int i=0;i<n;i++){
            if(all_people[i]){
                count+=1;
            }
        }
        System.out.println(count);
        scanner.close();
    }
}
