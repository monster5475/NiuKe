package com.pratice2;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author: wyh
 * 字符串长度最大乘积
 * @Day: 2020/3/7
 */
public class Code27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int length = str.length();
        String str1=str.substring(1,length-1);
        int result = 0;
        if(!str1.equals("")){
            String[] ss = str1.split(",");
            for (int i = 0; i < ss.length; i++) {
                ss[i] = ss[i].substring(1, ss[i].length() - 1);
            }
            Arrays.sort(ss, (s1, s2) -> s1.length() < s2.length() ? 1 : -1);
            Set<Character> mySet = new TreeSet<>();
            for (int i = 0; i < ss.length; i++) {
                mySet.clear();
                for (int k = 0; k < ss[i].length(); k++) {
                    mySet.add(ss[i].charAt(k));
                }
                Set<Character> otherSet = new TreeSet<>();
                otherSet.addAll(mySet);
                for (int j = i + 1; j < ss.length; j++) {
                    for (int k = 0; k < ss[j].length(); k++) {
                        otherSet.add(ss[j].charAt(k));
                    }
                    if (otherSet.size() == (ss[i].length() + ss[j].length())) {
                        result = Math.max(result, ss[i].length() * ss[j].length());
                    }
                }
            }
        }
        System.out.println(result);
        scanner.close();
    }
}
