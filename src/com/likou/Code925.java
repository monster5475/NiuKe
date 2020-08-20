package com.likou;

/**
 * @Author wyh
 * @Description 简单的匹配
 * @Date: 2020 08 10 下午8:54
 */
public class Code925 {
    public static boolean isLongPressedName(String name, String typed) {
        int length = name.length();
        int length_ = typed.length();
        int i=0, j=0;
        while(i<length && j< length_){
            if(name.charAt(i) == typed.charAt(j)){
                i+=1;
                j+=1;
            }else if(i>0 && typed.charAt(j) == name.charAt(i-1)){
                j+=1;
            }else{
                return false;
            }
        }
        if(j<length_){
            while (j<length_ && typed.charAt(j) == name.charAt(length-1)){
                j+=1;
            }
            if(j==length_){
                return true;
            }else{
                return false;
            }
        }
        if(i<length){
            return false;
        }
        return true;
    }

}
