package com.likou.Code1_40;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author: wyh
 * 串联所有单词的字串
 * @Day: 2020/3/31
 */
public class Code30 {
    public static List<Integer> findSubstring(String s, String[] words) {
        List<Integer> res = new ArrayList<>();
        if(words.length==0){
            return res;
        }
        HashMap<String, Integer> hashMap = new HashMap<>();
        int length_ = words[0].length();
        int length = s.length();
        for(String word:words){
            hashMap.put(word, hashMap.getOrDefault(word,0)+1);
        }
        for(int i=0;i<=length-length_;i++){
            HashMap<String, Integer> hash = new HashMap<>(hashMap);
            int start = i;
            String str = s.substring(start, start+length_);
            while (!hash.isEmpty()&&hash.containsKey(str)){
                if(hash.get(str)!=1){
                    hash.put(str, hash.get(str)-1);
                }else{
                    hash.remove(str);
                }
                start = start+length_;
                if(start+length_>length){
                    break;
                }
                str = s.substring(start, start+length_);
            }
            if(hash.isEmpty()){
                res.add(i);
            }
        }
        return res;
    }
}
