package com.pratice1;

/**
 * @author: wyh
 * 左旋转字符串
 * @Date: 2019/9/17 14:07
 */
public class Code42 {
    public String LeftRotateString(String str,int n) {
        if(str.equals("")){
            return "";
        }
        int length = str.length();
        String leftStr = str.substring(n,length);
        String rightStr = str.substring(0,n);
        return leftStr+rightStr;
    }
}
