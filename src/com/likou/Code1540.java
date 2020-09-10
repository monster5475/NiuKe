package com.likou;

/**
 * @author: wyh
 * 字母变换题 跟取余数一个思路
 * @Day: 2020/9/10
 */
public class Code1540 {
    public static boolean canConvertString(String s, String t, int k) {
        if(s.length()<t.length()){
            return false;
        }
        int[] cnts= new int[26];
        for(int i=0;i<s.length();i++){
            char tc=t.charAt(i);
            char sc=s.charAt(i);
            if(tc>sc){
                cnts[tc-sc]+=1;
            }else if(tc<sc){
                cnts[26-sc+tc]+=1;
            }
        }
        int max = Integer.MIN_VALUE;
        int tm=0;
        for(int i=0;i<26;i++){
            max = Math.max(max, cnts[i]);
            if(cnts[i]==max){
                tm=i;
            }
        }
        return k<(max-1)*26+tm?false:true;
    }
}
