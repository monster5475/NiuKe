package com.likou;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Author wyh
 * @Description 深搜+剪枝
 * @Date: 2020 08 09 下午11:51
 */
public class Code1239 {
    public static int cnt;

    public static List<String> array;

    public static boolean detect(String str, String s){
        int length = str.length() +s.length();
        Set<Character> set = new HashSet<>();

        for(char c:str.toCharArray()){
            set.add(c);
        }
        for(char c:s.toCharArray()){
            set.add(c);
        }
        if(length == set.size()){
            return true;
        }else{
            return false;
        }
    }

    public static void dfs(boolean[] flags, String dst,int index){
        cnt = Math.max(cnt, dst.length());
        for(int i=index;i<array.size();i++){
            if(!flags[i] && detect(dst, array.get(i))){
                flags[i] = true;
                String dst1 = dst + array.get(i);
                dfs(flags, dst1, i+1);
                flags[i] = false;
            }
        }
    }

    public static int maxLength(List<String> arr) {
        cnt=0;
        array = arr;
        int length = arr.size();
        boolean[] flags = new boolean[length];
        dfs(flags, "",0);
        return cnt;
    }
}
