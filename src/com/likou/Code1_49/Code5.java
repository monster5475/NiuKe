package com.likou.Code1_49;

/**
 * @author: wyh
 * 最长回文子串
 * @Day: 2020/3/13
 */
public class Code5 {
    public static String longestPalindrome(String s) {
        String t = "$#";
        int length = s.length();
        for(int i=0;i<length;i++){
            t+=s.charAt(i)+"#";
        }
        int id = 0, mx=0,reCenter=0,reLen = 0;
        int[] p =new int[t.length()];
        for(int i=1;i<t.length();i++){
            p[i] = mx>i?Math.min(p[2*id-i], mx-i):1;

            while(i+p[i]<t.length() && t.charAt(i+p[i]) == t.charAt(i-p[i])){
                p[i]++;
            }

            if(i+p[i]>mx){
                mx = i+p[i];
                id = i;
            }

            if(p[i]>reLen){
                reCenter = id;
                reLen=p[i];
            }
        }
        int start = (reCenter-reLen)/2;
        String res = s.substring(start, start+reLen-1);
        return res;
    }
}
