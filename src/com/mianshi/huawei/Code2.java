package com.mianshi.huawei;

import java.util.Scanner;

/**
 * @author: wyh
 * @Day: 2020/4/8
 */
public class Code2 {
    public static String m1(String str){
        int length = str.length();
        for(int j=0;j<length;j++){
            if(j+1<length && str.charAt(j) =='0' && str.charAt(j+1)=='0'){
                String left = str.substring(0,j);
                String right = str.substring(j+2,length);
                str = left+"10"+right;
                //System.out.println(str);
                //System.out.println(str);
            }
        }
        return str;
    }

    public static String m2(String str){
        int length = str.length();
        boolean flag = false;
        for(int j=0;j<length;j++){
            if(j+1<length && str.charAt(j) =='1' && flag){
                if(str.charAt(j+1)=='0') {
                    String left = str.substring(0, j);
                    String right = "";
                    if(j+2<length) {
                        right = str.substring(j + 2, length);
                    }
                    str = left + "01" + right;
                    break;
                }
            }
            if(str.charAt(j) == '0'){
                flag = true;
            }
        }
        return str;
    }

    public static int count0(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == '0'){
                count+=1;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t =scanner.nextInt();
        String[] strs = new String[t];
        for(int i=0;i<t;i++){
            int n = scanner.nextInt();
            strs[i] = scanner.next();
        }
        for(int i=0;i<t;i++){
            strs[i] = m1(strs[i]);
            while (count0(strs[i])>=2){
                strs[i] = m2(strs[i]);
                strs[i] = m1(strs[i]);
            }
        }
        for(int i=0;i<t;i++){
            System.out.println(strs[i]);
        }
        scanner.close();
    }
}
