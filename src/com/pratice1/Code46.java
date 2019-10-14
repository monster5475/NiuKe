package com.pratice1;

/**
 * @author: wyh
 * 求1+2+3...+n
 * @Date: 2019/9/21 14:16
 */
public class Code46 {
    public int Sum_Solution(int n) {
        int ans = n;
        boolean flag = (ans!=0) && ((ans += Sum_Solution(n-1))==0);
        return ans;
    }
}
