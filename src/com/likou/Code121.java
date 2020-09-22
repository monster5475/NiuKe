package com.likou;

/**
 * @author: wyh
 * 记录最低值 更新调整
 * @Date: 2020/9/22 16:52
 */
public class Code121 {
    public int maxProfit(int[] prices) {
        int length = prices.length;
        int minPrice = Integer.MAX_VALUE;
        int max=0;
        for(int i=0;i<length;i++){
            if(prices[i]<minPrice){
                minPrice = prices[i];
            }
            if(prices[i]-minPrice> max){
                max = prices[i]-minPrice;
            }
        }
        return max;
    }
}
