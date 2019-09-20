package com.pratice1;

/**
 * @author: wyh
 * 扑克牌顺子
 * @Date: 2019/9/17 15:49
 */
public class Code44 {
    public boolean isContinuous(int [] numbers) {
        int[] cards = new int[5];
        int count=0, count1=0;
        boolean[] flags = new boolean[5];
        int minNumber = Integer.MAX_VALUE;
        for(int i=0;i<numbers.length;i++){
            cards[i] = numbers[i];
            if(numbers[i]!=0){
                minNumber = numbers[i]<minNumber?numbers[i]:minNumber;
            }else{
                count+=1;
            }
        }
        for(int i=0;i<cards.length;i++){
            if(cards[i]!=0){
                cards[i]-=minNumber;
            }
        }
        for(int card: cards){
            if(card<cards.length){
                flags[card] = true;
            }
        }
        for(boolean flag1: flags){
            if(flag1==false){
                count1+=1;
            }
        }
        if(count == count1 || count1==0){
            return true;
        }else {
            return false;
        }
    }
}
