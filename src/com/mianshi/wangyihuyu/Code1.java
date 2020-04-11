package com.mianshi.wangyihuyu;

/**
 * @author: wyh
 * @Day: 2020/4/11
 */
public class Code1 {
    /**
     * 接收两个表示9进制数的字符串，返回表示它们相加后的9进制数的字符串
     * @param num1 string字符串 第一个加数
     * @param num2 string字符串 第二个加数
     * @return string字符串
     */
    public static String add (String num1, String num2) {
        // write code here
        int[] num1Char = getCharArray(num1);
        int[] num2Char = getCharArray(num2);
        int right_length1=-1, right_length2=-1;
        int[] numChar = new int[201];
        int t=0;
        for(int i=199;i>=0;i--){
            int s = num1Char[i]+num2Char[i]+t;
            if(s>=9){
                t = s/9;
                s= s%9;
            }else{
                t=0;
            }
            numChar[i+1] = s;
        }
        if(t!=0){
            numChar[0] = t;
        }
        if(num1.contains(".")){
            right_length1 = num1.split("\\.")[1].length();
        }
        if(num2.contains(".")){
            right_length2 = num2.split("\\.")[1].length();
        }
        String result = "";
        boolean flag = false;
        for(int i=0;i<101;i++){
            if(numChar[i]!=0||flag){
                flag = true;
                result+=numChar[i];
            }
        }
        if(right_length1!=-1||right_length2!=-1) {
            result += ".";
            int length = Math.max(right_length1, right_length2);
            for(int i=0;i<length;i++){
                int index = 101+i;
                result+=numChar[index];
            }
        }
        return result;
    }

    public static int[] getCharArray(String str){
        int[] num1Char = new int[200];
        if(str.contains(".")){
            String[] ss = str.split("\\.");
            int length1 = ss[0].length();
            for(int i=ss[0].length()-1;i>=0;i--){
                int index = 99 - (length1-1-i);
                num1Char[index] = ss[0].charAt(i)-'0';
            }
            int length2 = ss[1].length();
            for(int i=0;i<length2;i++){
                int index = 100 + i;
                num1Char[index] = ss[1].charAt(i)-'0';
            }
        }else{
            int length1 = str.length();
            for(int i=str.length()-1;i>=0;i--){
                int index = 99 - (length1-1-i);
                num1Char[index] = str.charAt(i)-'0';
            }
        }
        return num1Char;
    }
}
