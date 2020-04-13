package com.likou.Code1_49;

import java.util.Stack;

/**
 * @author: wyh
 * 有效的括号
 * @Day: 2020/3/24
 */
public class Code20 {
    public static boolean isValid(String s) {
        int length = s.length();
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<length;i++){
            switch (s.charAt(i)){
                case '(':{
                    stack.push('(');
                    break;
                }
                case ')':{
                    Character ch;
                    if(stack.isEmpty()) {
                        return false;
                    }else{
                        ch = stack.peek();
                    }
                    if(ch=='('){
                        stack.pop();
                    }else{
                        stack.push(')');
                    }
                    break;
                }
                case '[':{
                    stack.push('[');
                    break;
                }
                case ']':{
                    Character ch;
                    if(stack.isEmpty()) {
                        return false;
                    }else{
                        ch = stack.peek();
                    }
                    if(ch=='['){
                        stack.pop();
                    }else{
                        stack.push(']');
                    }
                    break;
                }
                case '{':{
                    stack.push('{');
                    break;
                }
                case '}':{
                    Character ch;
                    if(stack.isEmpty()) {
                        return false;
                    }else{
                        ch = stack.peek();
                    }
                    if(ch=='{'){
                        stack.pop();
                    }else{
                        stack.push('}');
                    }
                    break;
                }
            }
        }
        if(stack.isEmpty()) {
            return true;
        }else{
            return false;
        }
    }
}
