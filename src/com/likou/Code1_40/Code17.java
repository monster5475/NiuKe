package com.likou.Code1_40;

import java.util.*;

/**
 * @author: wyh
 * 电话号码的组合
 * @Day: 2020/3/24
 */
public class Code17 {
    public static List<String> letterCombinations(String digits) {
        List<String> ls = new ArrayList<>();
        Set<String> res  = new HashSet<>();
        Set<String> tString = new HashSet<>();
        int length = digits.length();
        char[][] numbers = {
                {'a', 'b', 'c'},{'d', 'e', 'f'},{'g', 'h', 'i'},
                {'j', 'k', 'l'},{'m', 'n', 'o'},{'p', 'q', 'r', 's'},
                {'t', 'u', 'v'},{'w', 'x', 'y', 'z'}
        };
        if(length==0){
            return ls;
        }
        int index = digits.charAt(0) - '2';
        char[] chs = numbers[index];
        for(int j=0;j<chs.length;j++){
            tString.add(chs[j]+"");
        }
        for(int i=1; i<length; i++){
            index = digits.charAt(i) - '2';
            chs = numbers[index];
            for(int j=0;j<chs.length;j++){
                Iterator<String> iterator = tString.iterator();
                while (iterator.hasNext()){
                    String ts = iterator.next();
                    ts+=chs[j];
                    res.add(ts);
                }
            }
            tString.clear();
            tString.addAll(res);
            res.clear();
        }
        ls.addAll(tString);
        return ls;
    }
}
