package com.likou;

/**
 * @Author wyh
 * @Description 数根
 * @Date: 2020 08 10 下午9:04
 */
public class Code258 {
    public int addDigits(int num) {
        return (num - 1) % 9 + 1;
    }
}
