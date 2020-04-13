package com.likou.Code1_49;

/**
 * @author: wyh
 * 最长公共前缀
 * @Day: 2020/3/17
 */
public class Code14 {
    public static String longestCommonPrefix(String[] strs) {
        if(strs.length==0){
            return "";
        }else if(strs.length==1){
            return strs[0];
        }
        int minLength = Integer.MAX_VALUE;
        for(int i=0;i<strs.length;i++){
            minLength = Math.min(minLength, strs[i].length());
        }
        if(minLength==0){
            return "";
        }
        int index=0;
        for(int i=1;i<minLength+1;i++){
            String res = strs[0].substring(0, i);
            boolean flag = true;
            for(int j=1;j<strs.length;j++){
                String str = strs[j];
                str = str.substring(0,i);
                if(str.equals(res)){
                    ;
                }else{
                    flag = false;
                    break;
                }
            }
            if(!flag){
                index = i-1;
                break;
            }else{
                index=i;
            }
        }
        if(index==0){
            return "";
        }
        return strs[0].substring(0,index);
    }
}
