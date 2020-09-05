package com.shixi.baidu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @author: wyh
 * @Day: 2020/3/29
 */
public class Code3 {
    public static int step;
    public static HashMap<Integer, ArrayList<Integer>> sides;
    public static int[] weight;

    public static void dps(int number, int s){
        if(!sides.containsKey(number)){
            return;
        }
        ArrayList<Integer> nodes = sides.get(number);
        for(int i=0;i<nodes.size();i++){
            int start = nodes.get(i);
            if(weight[start-1]>weight[number-1]){
                dps(start, s+1);
            }else{
                step = Math.max(step, s);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        weight = new int[n];
        for(int i=0;i<n;i++){
            weight[i] = scanner.nextInt();
        }
        sides = new HashMap<>(n-1);
        for(int i=0;i<n-1;i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if(sides.containsKey(a)){
                sides.get(a).add(b);
            }else {
                ArrayList<Integer> arrayList =new ArrayList<Integer>();
                arrayList.add(b);
                sides.put(a, arrayList);
            }
        }
        step=1;
        dps(1,1);
        if(step==1){
            step=0;
        }
        System.out.println(step);
        scanner.close();
    }
}
