package com.pratice1;

/**
 * @author: wyh
 * 求一个数的次方
 * @Date: 2019/9/3 13:04
 */
public class Code12 {
    public double Power(double base, int exponent) {
        return Math.pow(base, exponent);
    }

    public static void main(String[] args) {
        Code12 myMain = new Code12();
        double index = myMain.Power(1.4, 2);
        System.out.println(index);
    }
}
