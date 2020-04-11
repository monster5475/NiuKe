package com.likou.Code1_40;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author: wyh
 * 括号生成
 * @Day: 2020/3/28
 */
public class Code22 {
    public static void dg(List<String> res, int left, int right, int n, String str){
        if(left == n && right == n){
            res.add(str);
            return ;
        }
        if(left<n){
            dg(res, left+1, right, n,str+"(");
        }
        if(right<n && left>right){
            dg(res, left, right+1, n,str+")");
        }
    }

    public static List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        dg(res, 0, 0, n, "");
        return res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> strs = generateParenthesis(3);
        strs.stream().forEach(System.out::println);
        scanner.close();
    }
}
