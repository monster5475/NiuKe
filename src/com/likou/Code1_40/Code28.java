package com.likou.Code1_40;

/**
 * @author: wyh
 * 实现strStr
 * @Day: 2020/3/30
 */
public class Code28 {
    public int strStr(String haystack, String needle) {
        int res= -1;
        if(needle.length()==0){
            return 0;
        }
        for(int i=0;i<=haystack.length()-needle.length();i++){
            int count=0;
            for(int j=0;j<needle.length();j++){
                if(haystack.charAt(i+j) == needle.charAt(j)){
                    count+=1;
                }else{
                    break;
                }
            }
            if(count == needle.length()){
                res = i;
                break;
            }
        }
        return res;
    }
}
