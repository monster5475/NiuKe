package com.pratice1;

import java.util.Stack;

/**
 * @author: wyh
 * 用两个栈实现队列
 * @Date: 2019/9/3 14:00
 */
public class Code5 {

    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        while (!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        int res = stack2.pop();
        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        return res;
    }

    public static void main(String[] args) {
        Code5 myMain = new Code5();
        myMain.push(12);
        int index = myMain.pop();
        System.out.println(index);
    }
}
