package com.pratice1;

import sun.security.util.Length;

import java.lang.reflect.Array;
import java.util.stream.Collectors;
import java.util.*;

/**
 * @author: wyh
 *
 * @Date: 2019/9/3 13:04
 */


public class MyMain {
    Set<String> mySet = new HashSet<>();
    String myStr;
    public void getStr(int begin, int end){
        mySet.add(myStr);
        for(int i=begin;i<=end;i++){
            myStr = exchangeChar(begin, i);
            getStr(begin+1,end);
            myStr = exchangeChar(begin, i);
        }
    }

    public String exchangeChar(int i, int j){
        char[] stringArr = myStr.toCharArray();
        char strI = stringArr[i];
        stringArr[i] = stringArr[j];
        stringArr[j] = strI;
        return String.valueOf(stringArr);
    }

    public ArrayList<String> Permutation(String str) {
        ArrayList<String> result= new ArrayList<>();
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(Character.isUpperCase(c)||Character.isLowerCase(c)){
                ;
            }
            else{
                return result;
            }
        }
        myStr = str;
        int end = str.length()-1;
        int begin = 0;
        getStr(begin, end);
        result = new ArrayList<>(mySet);
        return result;
    }

    public static void main(String[] args) {
        MyMain myMain = new MyMain();
        ArrayList<String> result = myMain.Permutation("abcd");
        result.stream().forEach(System.out::println);
    }
}
