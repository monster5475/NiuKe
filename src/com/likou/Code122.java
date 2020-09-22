package com.likou;

/**
 * @author: wyh
 * 多次买入 能卖出就卖出 下次马上买入
 * @Date: 2020/9/22 17:04
 */
public class Code122 {
    public int maxProfit(int[] prices) {
        int length = prices.length;
        int minPrice = prices[0];
        int sum=0;
        for(int i=1;i<length;i++){
            if(prices[i]>minPrice && ((i+1<length && prices[i+1]<prices[i])||(i+1==length))){
                sum += prices[i] - minPrice;
                if(i+1<length){
                    minPrice = prices[i+1];
                }
            }
            if(prices[i]<minPrice){
                minPrice = prices[i];
            }
        }
        return sum;
    }
}
