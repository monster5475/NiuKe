package com.pratice2;


import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * @author: wyh
 * @Day: 2020/2/28
 */
public class Code17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int[] numbers = new int[n];
        for(int i=0;i<n;i++) {
            String rawStr = scanner.next();
            numbers[i] = Integer.valueOf(rawStr.substring(rawStr.length()-6, rawStr.length()));
        }
        Arrays.sort(numbers);
        IntStream.of(numbers).forEach(System.out::println);
        scanner.close();
    }
}
