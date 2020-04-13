package com.likou.Code1_49;

import java.util.HashMap;

/**
 * @author: wyh
 * 罗马数字转整数
 * @Day: 2020/3/17
 */
public class Code13 {
    public static int romanToInt(String s) {
        HashMap<String, Integer> hash = new HashMap<>();
        hash.put("A", 0);
        hash.put("I", 1);
        hash.put("V", 5);
        hash.put("X", 10);
        hash.put("L", 50);
        hash.put("C", 100);
        hash.put("CD", 400);
        hash.put("D", 500);
        hash.put("M", 1000);
        hash.put("IV", 4);
        hash.put("IX", 9);
        hash.put("XL", 40);
        hash.put("XC", 90);
        hash.put("CM", 900);
        int sum = 0;
        int length = s.length();
        int index= 0 ;
        while(index<length){
            String s1 = String.valueOf(s.charAt(index));
            String s2="";
            if(index+2<=length) {
                s2 = s.substring(index, index + 2);
            }
            int num1 = hash.get(s1);
            int num2 = 0;
            if(hash.containsKey(s2)){
                num2 = hash.get(s2);
            }
            int max = Math.max(num1,num2);
            if(max == num1){
                index+=1;
            }else{
                index+=2;
            }
            sum+=max;
        }
        return sum;
    }
}
