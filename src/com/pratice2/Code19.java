package com.pratice2;

import java.util.HashMap;
import java.util.Scanner;

/**
 * https://www.nowcoder.com/ta/2019test
 * 游戏海报
 * @author: wyh
 * @Date: 2020/3/6 21:36
 */
public class Code19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        HashMap<String,Integer> countHash = new HashMap<>();
        int length=str.length();
        for(int i=0;i<26;i++){
            char newCh = (char)('a'+i);
            for(int j=0;j<length+1;j++){
                String leftStr = str.substring(0,j);
                String rightStr = str.substring(j,length);
                String newStr =leftStr+newCh+rightStr;
                countHash.put(newStr, 1);
            }
        }
        System.out.println(countHash.size());
        scanner.close();
    }
}