package com.likou.Code50_100;

/**
 * @Author wyh
 * @Description 爬楼梯
 * @Date: 2020 05 22 上午9:50
 */
public class Code70 {
    public int climbStairs(int n) {
        int n1=1;
        int n2=2;
        if(n==1){
            return n1;
        }else if(n==2){
            return n2;
        }else {
            int res=0;
            for (int i =2;i<n;i++){
                res = n1+n2;
                n1 = n2;
                n2 = res;
            }
            return res;
        }
    }
}
