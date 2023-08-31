package com.likou.Code1_49;

/**
 * @author: wyh
 * 回文串
 * @Day: 2020/3/14
 */
public class Code9 {
    public boolean isPalindrome(int x) {
        String xStr = String.valueOf(x);
        if (xStr.length() == 1) {
            return true;
        }
        int begin = 0, end = xStr.length()-1;
        while (begin < end) {
            if (xStr.charAt(begin) != xStr.charAt(end)) {
                return false;
            }
            begin += 1;
            end -= 1;
        }
        return true;
    }
}
