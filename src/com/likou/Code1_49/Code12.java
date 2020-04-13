package com.likou.Code1_49;

import java.util.HashMap;

/**
 * @author: wyh
 * 整数转罗马字
 * @Day: 2020/3/17
 */
public class Code12 {
    public static String intToRoman(int num) {
        HashMap<Integer, String> hash = new HashMap<>();
        hash.put(1, "I");
        hash.put(5, "V");
        hash.put(10, "X");
        hash.put(50, "L");
        hash.put(100, "C");
        hash.put(400, "CD");
        hash.put(500, "D");
        hash.put(1000, "M");
        hash.put(4, "IV");
        hash.put(9, "IX");
        hash.put(40, "XL");
        hash.put(90, "XC");
        hash.put(900, "CM");
        int[] numbers = {1,4,5,9,10,40,50,90,100,400,500,900,1000};
        int length = numbers.length;
        String res = "";
        while(num>0){
            int index = 0;
            for(int i=length-1;i>=0;i--){
                if(numbers[i]<=num){
                    index = i;
                    break;
                }
            }
            String str = hash.get(numbers[index]);
            res+=str;
            num-=numbers[index];
        }
        return res;
    }
}
