package com.shixi.wangyi;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author: wyh
 * @Day: 2020/4/7
 */
public class Code2 {
    public static class Monster{
        public int fanggyu;
        public int shanghai;
        public Monster(int fanggyu, int shanghai){
            this.fanggyu = fanggyu;
            this.shanghai = shanghai;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int d = scanner.nextInt();
        int[] fangyu = new int[n];
        int[] shanghai = new int[n];
        for(int i=0;i<n;i++){
            fangyu[i] = scanner.nextInt();
        }
        for(int i=0;i<n;i++){
            shanghai[i] = scanner.nextInt();
        }
        Monster[] monsters = new Monster[n];
        for(int i=0;i<n;i++){
            monsters[i] = new Monster(fangyu[i], shanghai[i]);
        }
        Arrays.sort(monsters, (m1, m2)->m1.fanggyu-m2.fanggyu);
        int shanghai_=0;
        for(int i=0;i<n;i++){
            if(d<monsters[i].fanggyu){
                shanghai_+=monsters[i].shanghai;
            }
            d+=1;
        }
        System.out.println(shanghai_);
        scanner.close();
    }
}
