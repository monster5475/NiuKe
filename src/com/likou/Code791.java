package com.likou;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author wyh
 * @Description 简单排序
 * @Date: 2020 08 13 下午9:39
 */
public class Code791 {
    public static String customSortString(String S, String T) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for(char ch : T.toCharArray()){
            hashMap.put(ch,hashMap.getOrDefault(ch,0) +1);
        }
        String res = "";
        for(char ch : S.toCharArray()){
            if(hashMap.containsKey(ch)){
                res += String.join("",  Collections.nCopies(hashMap.get(ch),String.valueOf(ch)));
                hashMap.remove(ch);
            }
        }
        for(Map.Entry entry: hashMap.entrySet()){
            res+=String.join("",
                    Collections.nCopies((int)entry.getValue(),String.valueOf(entry.getKey())));
        }
        return res;
    }

}
