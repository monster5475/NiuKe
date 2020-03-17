package com.mianshi.kuaishouC;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

/**
 * @author: wyh
 * @Day: 2020/3/15
 */
public class Code2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] Q = new int[n];
        int[] L = new int[n];
        for(int i=0;i<n;i++){
            Q[i] = scanner.nextInt();
        }
        for(int i=0;i<n;i++){
            L[i] = scanner.nextInt();
        }
        HashMap<Integer, ArrayList<Integer>> hash = new HashMap<>(m);
        for(int i=0;i<n;i++){
            if(hash.containsKey(L[i])){
                hash.get(L[i]).add(i+1);
            }else{
                ArrayList<Integer> arrayList = new ArrayList<>();
                arrayList.add(i+1);
                hash.put(L[i], arrayList);
            }
        }
        int sum=0;
        Iterator<Integer> iterator = hash.keySet().iterator();
        while(iterator.hasNext()){
            int key = iterator.next();
            ArrayList<Integer> value = hash.get(key);
            for(int i=0;i<value.size();i++){
                for(int j=i+1;j<value.size();j++){
                    int j_ = value.get(j);
                    int i_ = value.get(i);
                    if((j_-i_)%2==0){
                        sum+= (i_+j_)*(Q[i_-1]+Q[j_-1]);
                        if(sum>10007){
                            sum%=10007;
                        }
                    }
                }
            }
        }
        System.out.println(sum%10007);
        scanner.close();
    }
}
