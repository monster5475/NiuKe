package com.likou;

/**
 * @Author wyh
 * @Description 水题翻转字符串
 * @Date: 2020 08 10 上午11:31
 */
public class Code125 {
    public static boolean isPalindrome(String s) {
        int length = s.length();
        String str="";
        for(int i=0; i<length; i++){
            char ch = s.charAt(i);
            char c='#';
            if(ch>='A'&&ch<='Z'){
                c = (char) (ch-'A'+'a');
            }else if(ch>='a'&&ch<='z'){
                c = ch;
            }else if(ch>='0' && ch<='9'){
                c = ch;
            }
            if(c!='#'){
                str+=String.valueOf(c);
            }
        }
        String str1 = new StringBuilder(str).reverse().toString();
        return  str.equals(str1);
    }
}
