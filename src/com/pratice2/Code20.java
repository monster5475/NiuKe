package com.pratice2;

import java.util.Scanner;

/**
 * @author: wyh
 * 合并数组
 * @Day: 2020/3/6
 */
public class Code20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String left = scanner.next();
        if(!scanner.hasNext()){
            System.out.println(left);
        }else {
            String right = scanner.next();
            String result = "";
            int i = 0, j = 0;
            String[] lefts = left.split(",");
            String[] rights = right.split(",");
            int left_ = lefts.length, right_ = rights.length;
            while (i < left_ && j < right_) {
                if (Integer.valueOf(lefts[i]) <= Integer.valueOf(rights[j])) {
                    result += lefts[i] + ",";
                    i += 1;
                } else {
                    result += rights[j] + ",";
                    j += 1;
                }
            }
            while (i < left_) {
                result += lefts[i] + ",";
                i += 1;
            }
            while (j < right_) {
                result += rights[j] + ",";
                j += 1;
            }
            System.out.println(result.substring(0, result.length() - 1));
        }
        scanner.close();
    }
}
