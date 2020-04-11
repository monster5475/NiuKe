package com.likou.Code1_40;

/**
 * @author: wyh
 * 字符串转换整数(atoi)
 * @Day: 2020/3/14
 */
public class Code8 {
    public static int myAtoi(String str) {
        int length = str.length();
        int t=1;
        String number_str = "";
        boolean fuhao = false;
        for(int i=0;i<length;i++){
            char ch = str.charAt(i);
            if(ch==' '){
                if((!number_str.equals(""))||fuhao){
                    break;
                }
            }else if(ch=='+'){
                if((!number_str.equals(""))||fuhao){
                    break;
                }
                t=1;
                fuhao=true;
            }else if(ch=='-'){
                if((!number_str.equals(""))||fuhao){
                    break;
                }
                t=-1;
                fuhao=true;
            }else if(ch>='0'&&ch<='9'){
                number_str+=ch;
            }else{
                break;
            }
        }
        Long n;
        if(!number_str.equals("")){
            int i=0;
            while(i!=number_str.length()&&number_str.charAt(i)=='0'){
                i++;
            }
            if(i<number_str.length()) {
                number_str = number_str.substring(i, number_str.length());
            }else{
                number_str="0";
            }
            if(number_str.length()>12){
                n = Long.MAX_VALUE;
            }else {
                n = Long.valueOf(number_str);
            }
            n*=t;
        }else{
            n=0L;
        }
        int res;
        if(n>Integer.MAX_VALUE){
            res =Integer.MAX_VALUE;
        }else if(n<Integer.MIN_VALUE){
            res = Integer.MIN_VALUE;
        }else{
            res = n.intValue();
        }
        return res;
    }
}
