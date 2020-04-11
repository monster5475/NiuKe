package com.likou.Code1_40;

/**
 * @author: wyh
 * 外观数列
 * @Day: 2020/4/2
 */
public class Code38 {
    public static String countAndSay(int n) {
        String str = "1";
        for(int i=1;i<n;i++){
            int count=0;
            char t='0';
            String newStr="";
            for(int j=0;j<str.length();j++) {
                char ch = str.charAt(j);
                if (ch != t) {
                    if(count>=1){
                        newStr += "" + count + t;
                    }
                    t = ch;
                    count = 1;
                } else {
                    count += 1;
                }
                if(j==str.length()-1){
                    newStr += "" + count + ch;
                }
            }
            str = newStr;
        }
        return str;
    }
}
