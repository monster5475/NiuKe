package com.likou;

/**
 * @Author wyh
 * @Description
 * @Date: 2020 08 10 下午9:00
 */
public class Code1641 {
    public String replaceSpaces(String S, int length) {
        S = S.substring(0,length);
        return S.replaceAll(" ","%20");
    }
}
