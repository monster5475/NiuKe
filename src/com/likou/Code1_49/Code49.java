package com.likou.Code1_49;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @author: wyh
 * 字母异位词数组
 * @Day: 2020/4/5
 */
public class Code49 {
    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hashMap = new HashMap<>();
        for(int i=0;i<strs.length; i++){
            String str = strs[i];
            char[] arrayChar = str.toCharArray();
            Arrays.sort(arrayChar);
            String s = String.valueOf(arrayChar);
            hashMap.putIfAbsent(s, new ArrayList<>());
            hashMap.get(s).add(str);
        }
        List<List<String>> res = new ArrayList<>(hashMap.values());
        return res;
    }
}
