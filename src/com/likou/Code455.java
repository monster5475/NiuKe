package com.likou;

import java.util.Arrays;

/**
 * @author: wyh
 * 简单排序 贪心
 * @Date: 2020/9/22 14:49
 */
public class Code455 {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int start = 0;
        int index=0;
        while (index<g.length && start< s.length){
            if(g[index]<=s[start]){
                index+=1;
            }
            start+=1;
        }
        return index;
    }
}
