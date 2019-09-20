package com.pratice1;

import sun.security.util.Length;

import java.lang.reflect.Array;
import java.util.stream.Collectors;
import java.util.*;
import java.util.stream.Stream;

/**
 * @author: wyh
 *
 * @Date: 2019/9/3 13:04
 */


public class MyMain {

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

    public static void main(String[] args) {
        MyMain myMain =new MyMain();
        int[] array = {1,3,2,6,4};
        int[] num1 = new int[1];
        int[] num2 = new int[1];
        boolean flag = myMain.isContinuous(array);
        System.out.println(flag);
    }
}
