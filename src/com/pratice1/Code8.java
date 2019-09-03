package com.pratice1;

/**
 * @author: wyh
 * 跳台阶
 * @Date: 2019/9/3 14:42
 */
public class Code8 {
    public int JumpFloor(int target) {
        int res = 0;
        if(target == 0) {res = 0;}
        if(target == 1) {res = 1;}
        if(target == 2) {res = 2;}
        if(target > 2) { res = JumpFloor(target-1) + JumpFloor(target-2);}
        return res;
    }

    public static void main(String[] args) {
        Code8 myMain = new Code8();
        int index = myMain.JumpFloor(4);
        System.out.println(index);
    }
}
