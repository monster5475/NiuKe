package com.likou;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * @Author wyh
 * @Description
 * @Date: 2020 08 20 下午5:09
 */
public class Code1054 {
    public static int[] rearrangeBarcodes(int[] barcodes) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int barcode : barcodes) {
            hashMap.put(barcode, hashMap.getOrDefault(barcode, 0) + 1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> queue =
                new PriorityQueue<>((en1, en2)->en2.getValue()-en1.getValue());
        queue.addAll(hashMap.entrySet());

        int[] res = new int[barcodes.length];
        int start=0;
        while (!queue.isEmpty()){
            Map.Entry<Integer,Integer> entry = queue.poll();
            if(queue.isEmpty()){
                res[start++] =entry.getKey();
                if(entry.getValue()!=1){
                    entry.setValue(entry.getValue()-1);
                    queue.add(entry);
                }
            }else{
                Map.Entry<Integer,Integer> entry1 = queue.poll();
                res[start++] = entry.getKey();
                res[start++] = entry1.getKey();
                if(entry.getValue()!=1){
                    entry.setValue(entry.getValue()-1);
                    queue.add(entry);
                }
                if(entry1.getValue()!=1){
                    entry1.setValue(entry1.getValue()-1);
                    queue.add(entry1);
                }
            }
        }
        return res;
    }

}
