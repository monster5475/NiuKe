package com.pratice1;

import java.util.Stack;

/**
 * @author: wyh
 * 栈的压入、弹出序列
 * @Date: 2019/9/5 13:39
 */
public class Code20 {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        Stack<Integer> stack = new Stack<>();
        int index = 0;
        int indexPop = 0;
        while(index!=pushA.length && indexPop!= popA.length){
            if (pushA[index] != popA[indexPop]) {
                stack.push(pushA[index]);
                index++;
            } else if (pushA[index] == popA[indexPop]) {
                index++;
                indexPop++;
                while (!stack.isEmpty() && stack.peek()==popA[indexPop]){
                    stack.pop();
                    indexPop++;
                }
            }
        }
        if(stack.isEmpty()){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        Code20 myMain = new Code20();
        int[] pushA = {1,2,3,4,5};
        int[] popA = {4,3,5,1,2};
        boolean flag = myMain.IsPopOrder(pushA, popA);
        System.out.println(flag);
    }
}
