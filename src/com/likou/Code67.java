package com.likou;

/**
 * @author: wyh
 * 二进制求和
 * @Day: 2020/4/22
 */
public class Code67 {
    public String addBinary(String a, String b) {
        int lengthA = a.length();
        int lengthB = b.length();
        if(lengthA>lengthB){
            for(int i=lengthB;i<lengthA;i++){
                b="0"+b;
            }
        }else{
            for(int i=lengthA;i<lengthB;i++){
                a="0"+a;
            }
        }
        int maxLength = Math.max(lengthA, lengthB);
        int t=0;
        String result="";
        for(int i=maxLength-1;i>=0;i--){
            int aa = a.charAt(i)-'0';
            int bb = b.charAt(i)-'0';
            int cc = aa+bb+t;
            if(cc>=2){
                cc-=2;
                t=1;
            }else{
                t=0;
            }
            result=cc+result;
        }
        if(t==1){
            result="1"+result;
        }
        return result;
    }
}
