package com.mianshi.wangyi;

import java.util.*;

/**
 * @author: wyh
 * @Day: 2020/4/7
 */
public class Code3_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int f = scanner.nextInt();
        int[] peoples = new int[51];
        HashMap<Integer, Set<Integer>> hashMap = new HashMap<>();
        for(int i=0;i<m;i++){
            int q  = scanner.nextInt();
            List<Integer> party = new ArrayList<>();
            for(int j =0;j<q;j++){
                peoples[j] = scanner.nextInt();
                party.add(peoples[j]);
            }
            for(int j=0;j<q;j++){
                List<Integer> array = new ArrayList<>(party);
                int tt = peoples[j];
                array.removeIf(value->value == tt);
                if(hashMap.containsKey(peoples[j])){
                    hashMap.get(peoples[j]).addAll(array);
                }else{
                    hashMap.put(peoples[j], new HashSet<>(array));
                }
            }
        }
        int count = 0;
        if(hashMap.containsKey(f)){
            HashSet<Integer> hs = (HashSet<Integer>) hashMap.get(f);
            HashSet<Integer> yiganran = new HashSet<>();
            HashSet<Integer> xinganran = new HashSet<>();
            yiganran.add(f);
            while(true) {
                Iterator<Integer> hs_ = hs.iterator();
                while (hs_.hasNext()) {
                    int p = hs_.next();
                    if(yiganran.contains(p)){
                        ;
                    }else{
                        xinganran.add(p);
                    }
                }
                if(xinganran.isEmpty()){
                    break;
                }else{
                    yiganran.addAll(xinganran);
                    hs = xinganran;
                    xinganran = new HashSet<>();
                }
            }
            count = yiganran.size();
        }else{
            count=1;
        }
        System.out.println(count);
        scanner.close();
    }
}
