package com.pratice1;

/**
 * @author: wyh
 * 第一个只出现一次的字符
 * @Date: 2019/9/14 17:02
 */
public class Code33 {
    public int FirstNotRepeatingChar(String str) {
        int length = str.length();
        if(length==0){
            return -1;
        }
        for(int i=0; i<length-1; i++){
            if(str.charAt(i)=='1'){
                continue;
            }
            String tstr = str.substring(i+1, length);
            String s =String.valueOf(str.charAt(i));
            int index = tstr.indexOf(s);
            if(index==-1){
                return i;
            }else{
                str = str.replaceAll(s, "1");
            }
        }
        if(str.charAt(length-1)!='1'){
            return length;
        }
        return -1;
    }
}
