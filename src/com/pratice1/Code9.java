package com.pratice1;

/**
 * @author: wyh
 * 变态跳台阶
 * @Date: 2019/9/3 14:51
 */
public class Code9 {
    public int JumpFloorII(int target) {
        int res = 0;
        if(target == 0) {res = 0;}
        if(target == 1) {res = 1;}
        if(target == 2) {res = 2;}
        if(target > 2) {
            for(int i=1; i<target; i++){
                res += JumpFloorII(target-i);
            }
            res ++;
        }
        return res;
    }

    public static void main(String[] args) {
        Code9 myMain = new Code9();
        int index = myMain.JumpFloorII(4);
        System.out.println(index);
    }
}
