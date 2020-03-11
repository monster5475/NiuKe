package com.pratice2;

import java.util.Scanner;

/**
 * @author: wyh
 * @Day: 2020/2/28
 */
public class Code16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String rawStr = scanner.next();
        int[] alph = new int[26];
        int length = rawStr.length();
        for(int i=0;i<length;i++){
            alph[rawStr.charAt(i)-'a']+=1;
        }
        String desStr = "";
        for(int i=0;i<alph.length;i++){
            String ch = String.valueOf ((char)('a' + i));
            String number;
            if(alph[i]==0){
                ch = "";
                number="";
            }else if(alph[i]==1){
                number="";
            }else{
                number=String.valueOf(alph[i]);
            }
            desStr += ch + number;
        }
        System.out.println(desStr);
        scanner.close();
    }
}