package com.pratice2;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author: wyh
 * @Date: 2019/10/30 10:50
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt(), m =scanner.nextInt();
        long k = scanner.nextLong();
        int[] numbers = new int[n+m];
        for(int i=0;i<n;i++){
            numbers[i]=1;
        }
        for(int i=n;i<n+m;i++){
            numbers[i]=2;
        }
        while(k!=1){
            int index = -1;
            for(int i=m+n-1;i>0;i--){
                if(numbers[i]>numbers[i-1]){
                    index = i-1;
                    break;
                }
            }
            if(index==-1){
                break;
            }else{
                int j=0;
                for(int i=m+n-1;i>index;i--){
                    if(numbers[i]>numbers[index]){
                        j=i;
                    }
                }
                int temp = numbers[j];
                numbers[j] = numbers[index];
                numbers[index] = temp;
                Arrays.sort(numbers, index+1,n+m);
            }
            k-=1;
        }
        if(k!=1){
            System.out.println(-1);
        }else{
            for(int i=0;i<n+m;i++){
                if(numbers[i]==1){
                    System.out.print('a');
                }else{
                    System.out.print('z');
                }
            }
            System.out.println();
        }
        scanner.close();
    }
}
