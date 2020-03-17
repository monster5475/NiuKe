package com.likou;

/**
 * @author: wyh
 * z字形变换
 * @Day: 2020/3/13
 */
public class Code6 {
    public static String convert(String s, int numRows) {
        if(numRows==1){
            return s;
        }
        int length =s.length();
        int t = numRows*2-2;
        String res = "";
        for(int i=0;i<numRows;i++){
            String ss = "";
            int pos = i;
            while(pos<length){
                ss+=s.charAt(pos);
                if(i!=0&&i!=numRows-1&&pos+t-i*2<length){
                    ss+=s.charAt(pos+t-i*2);
                }
                pos+=t;
            }
            res+=ss;
        }
        return res;
    }
}
