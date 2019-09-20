package com.pratice1;

/**
 * @author: wyh
 * 翻转单词顺序列
 * @Date: 2019/9/17 14:17
 */
public class Code43 {
    public String ReverseSentence(String str) {
        String[] ss = str.split(" ");
        String res = "";
        for(int i=ss.length-1;i>=0;i--){
            res += ss[i]+ " ";
        }
        if(ss.length!=0){
            res = res.substring(0,res.length()-1);
        }else{
            res = str;
        }
        return res;
    }
}
