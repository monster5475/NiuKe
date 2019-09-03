package com.pratice1;

/**
 * @author: wyh
 * 矩形覆盖
 * @Date: 2019/9/3 15:05
 */
public class Code10 {
    public int RectCover(int target) {
        int res = 0;
        if(target==1) {res = 1;}
        if(target==2) {res = 2;}
        if(target>2) {res = RectCover(target-1) + RectCover(target - 2);}
        return res;
    }

    public static void main(String[] args) {
        Code10 myMain = new Code10();
        int index = myMain.RectCover(3);
        System.out.println(index);
    }
}
