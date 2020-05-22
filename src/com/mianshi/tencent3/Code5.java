package com.mianshi.tencent3;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author: wyh
 * @Day: 2020/4/26
 */
public class Code5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i=0;i<n;i++){
            long number = scanner.nextLong();
            int index= scanner.nextInt();
            Stack<Long> stack = new Stack<>();
            while (number>1){
                number = number/2;
                stack.push(number);
            }
            long res=0;
            while (index>0){
                if(stack.isEmpty()){
                    res = -1;
                    break;
                }else{
                    res = stack.pop();
                    index-=1;
                }
            }
            System.out.println(res);
        }
        scanner.close();
    }
}
