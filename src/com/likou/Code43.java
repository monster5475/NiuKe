package com.likou;

import java.util.Collections;

/**
 * @author: wyh
 * 字符串相乘
 * @Day: 2020/4/3
 */
public class Code43 {
    public static String add(String res, String str){
        int length1 = str.length(), length2 =res.length(),max;
        if(length1<length2){
            str=String.join("", Collections.nCopies(length2-length1,"0"))+str;
            max = length2;
        }else{
            res = String.join("",Collections.nCopies(length1-length2,"0"))+res;
            max = length1;
        }
        String result="";
        int s=0,t=0;
        for(int i=max-1;i>=0;i--){
            int num1 = str.charAt(i)-'0', num2 = res.charAt(i)-'0';
            s = num1+num2+t;
            if(s>=10){
                t = s/10;
                s = s%10;
            }else{
                t=0;
            }
            result=s+result;
        }
        if(t!=0){
            result = t+result;
        }
        return result;
    }

    public static String multiply(String num1, String num2) {
        int length1= num1.length(), length2 = num2.length();
        String maxStr, minStr;
        if(length1>=length2){
            maxStr = num1;
            minStr = num2;
        }else{
            maxStr = num2;
            minStr = num1;
        }
        String res = "";
        for(int i=minStr.length()-1;i>=0;i--){
            int min_ = minStr.charAt(i)-'0', num_, t=0, value=0;
            String str = "";
            for(int j=maxStr.length()-1;j>=0;j--){
                num_ = maxStr.charAt(j) - '0';
                value =  min_*num_ +t;
                if(value>=10){
                    t = value/10;
                    value = value%10;
                }else{
                    t=0;
                }
                str=value+str;
            }
            if(t!=0){
                str=t+str;
            }
            str += String.join("", Collections.nCopies(minStr.length()-1-i, "0"));
            if(res.equals("")){
                res = str;
            }else{
                res = add(str, res);
            }
        }
        int index=-1;
        for(int i=0;i<res.length();i++){
            if(res.charAt(i)!='0'){
                index = i;
                break;
            }
        }
        if(index==-1){
            res = "0";
        }else{
            res = res.substring(index,res.length());
        }
        return res;
    }
}
