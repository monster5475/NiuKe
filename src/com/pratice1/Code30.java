package com.pratice1;

/**
 * @author: wyh
 * 整数中1出现的次数
 * @Date: 2019/9/13 17:06
 */
public class Code30 {
    public int count1(int number){
        int sum = 0;
        while (number>0){
            if(number%10==1){
                sum+=1;
            }
            number = number / 10;
        }
        return sum;
    }

    public int NumberOf1Between1AndN_Solution(int n) {

        int sum = 0;
        for (int i=1; i<=n; i++){
            sum += count1(i);
        }
        return sum;
    }
}
