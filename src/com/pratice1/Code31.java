package com.pratice1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringJoiner;
import java.util.stream.Collectors;

/**
 * @author: wyh
 * 求最小的数
 * @Date: 2019/9/14 12:46
 */
public class Code31 {
    public String PrintMinNumber(int [] numbers) {
        ArrayList<Integer> arrayList = Arrays.stream(numbers)
                .boxed()
                .collect(Collectors.toCollection(ArrayList::new));
        arrayList.sort((num1,num2) -> {
            String s1 = num1 + "" + num2;
            String s2 = num2 + "" + num1;
            if(s1.compareTo(s2)>0){
                return 1;
            }else{
                return -1;
            }
        });
        StringJoiner stringJoiner = new StringJoiner("");
        arrayList.stream().forEach(number->stringJoiner.add(String.valueOf(number)));
        return stringJoiner.toString();
    }

    public static void main(String[] args) {
        Code31 myMain =new Code31();
        int[] numbers = {3,32,321};
        String str = myMain.PrintMinNumber(numbers);
        System.out.println(str);
    }
}
