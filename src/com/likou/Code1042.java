package com.likou;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * @Author wyh
 * @Description 简单着色问题
 * @Date: 2020 08 20 下午8:20
 */
public class Code1042 {

    public int[] gardenNoAdj(int N, int[][] paths) {
        HashMap<Integer, Set<Integer>> hashMap=  new HashMap<>();
        int[] huayuans = new int[N];
        for(int i=0;i<N;i++){
            hashMap.put(i,new HashSet<>());
        }
        for(int i=0;i<paths.length;i++){
            hashMap.get(paths[i][0]-1).add(paths[i][1]-1);
            hashMap.get(paths[i][i]-1).add(paths[i][0]-1);
        }
        for(int i=0;i<N;i++){
            boolean[] colors = new boolean[5];
            Set<Integer> set = hashMap.get(i);
            for(Integer in:set){
                colors[huayuans[in]]=true;
            }
            for(int j=1;j<5;j++){
                if (!colors[j]){
                    huayuans[i] = j;
                }
            }
        }
        return huayuans;
    }
}
