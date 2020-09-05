package com.shixi.baidu;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author: wyh
 * @Day: 2020/3/29
 */
public class Code2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] numbers = new long[n];
        for(int i=0;i<n;i++){
            numbers[i] = scanner.nextLong();
        }
        Arrays.sort(numbers);
        long count=0, t;
        while (numbers[n-1]>=n){
            t = numbers[n-1]/n;
            for(int i=0;i<n-1;i++){
                numbers[i]+=t;
            }
            numbers[n-1] = numbers[n-1]%n;
            Arrays.sort(numbers);
            count+=t;
        }
        System.out.println(count);
        scanner.close();
    }
}
