package com.mianshi.kuaishouA;

import java.util.Scanner;

/**
 * @author: wyh
 * @Day: 2020/3/22
 */
public class CodeB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] strs =str.split(" ");
        int length = strs.length;
        int[] numbers = new int[length];
        for(int i=0;i<length;i++){
            numbers[i] = Integer.valueOf(strs[i]);
        }
        if(length==1){
            System.out.println("-1");
            return;
        }
        int[] array = new int[length];
        int max1,max2;
        int index =0;
        if(numbers[0]>numbers[1]){
            array[index] = 1;
            index+=1;
            max1 = numbers[0];
            max2 = numbers[1];
        }else{
            max1 = numbers[1];
            max2 = numbers[0];
        }
        for(int i=2;i<length;i++){
            if(numbers[i]<max1&&numbers[i]>=max2){
                array[index] = i;
                index+=1;
                max2 = numbers[i];
            }else if(numbers[i]>=max1){
                max2 = max1;
                max1= numbers[i];
            }
        }
        String res = "";
        if(index!=0){
            for(int i=0;i<index;i++){
                res +=array[i] + " ";
            }
            res = res.substring(0,res.length()-1);
        }else{
            res = "-1";
        }
        System.out.println(res);
        scanner.close();
    }
}
