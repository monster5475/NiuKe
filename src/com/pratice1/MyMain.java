package com.pratice1;

import jdk.nashorn.internal.ir.Flags;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author: wyh
 *
 * @Date: 2019/9/3 13:04
 */
import java.util.Stack;
public class MyMain {

    public boolean IsPopOrder(int [] pushA,int [] popA) {
        Stack<Integer> stack = new Stack<>();
        int index = 0;
        int indexPop = 0;
        while(index!=pushA.length && indexPop!= popA.length){
            while (!stack.isEmpty() && stack.peek()==popA[indexPop]){
                stack.pop();
                indexPop++;
            }
            if(pushA[index] != popA[indexPop]){
                stack.push(pushA[index]);
                index++;
            }else if(pushA[index] == popA[indexPop]){
                index++;
                indexPop++;
            }
        }
        if(stack.isEmpty()){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        MyMain myMain = new MyMain();
        int[] pushA = {1,2,3,4,5};
        int[] popA = {4,5,3,2,1};
        boolean flag = myMain.IsPopOrder(pushA, popA);
        System.out.println(flag);
    }
}
