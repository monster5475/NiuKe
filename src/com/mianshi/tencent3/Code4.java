package com.mianshi.tencent3;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author: wyh
 * @Day: 2020/4/26
 */
public class Code4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Long> stack1 = new Stack<>();
        Stack<Long> stack2 = new Stack<>();
        int n = Integer.valueOf(scanner.nextLine());
        for(int i=0;i<n;i++){
            String s = scanner.nextLine();
            if(s.contains("add")){
                String[] ss = s.split(" ");
                stack1.push(Long.valueOf(ss[1]));
            }else if(s.contains("peek")){
                while (!stack1.isEmpty()){
                    stack2.push(stack1.pop());
                }
                long res =stack2.peek();
                System.out.println(res);
                while (!stack2.isEmpty()){
                    stack1.push(stack2.pop());
                }
            }else if (s.contains("poll")){
                while (!stack1.isEmpty()){
                    stack2.push(stack1.pop());
                }
                stack2.pop();
                while (!stack2.isEmpty()){
                    stack1.push(stack2.pop());
                }
            }
        }
        scanner.close();
    }
}
