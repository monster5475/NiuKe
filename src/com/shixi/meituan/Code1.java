package com.shixi.meituan;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author: wyh
 * @Day: 2020/3/19
 */
public class Code1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] max1 = new int[3];
        int[] max2 = new int[3];
        int number;
        for(int i=0;i<n;i++){
            if(i<3){
                max1[i] = scanner.nextInt();
            }else{
                Arrays.sort(max1);
                number = scanner.nextInt();
                if(number>max1[0]){
                    max1[0] = number;
                }
            }
        }
        for(int i=0;i<n;i++){
            if(i<3){
                max2[i] = scanner.nextInt();
            }else{
                Arrays.sort(max2);
                number = scanner.nextInt();
                if(number>max2[0]){
                    max2[0] = number;
                }
            }
        }
        long max11 = 0;
        for(int i=0;i<3;i++){
            max11 +=max1[i];
        }
        long max22 = 0;
        for(int i=0;i<3;i++){
            max22 +=max2[i];
        }
        System.out.println(Math.max(max11, max22));
        scanner.close();
    }
}
