package com.pratice2;

// https://www.nowcoder.com/ta/2019test

import java.util.Scanner;

/**
 * @author: wyh
 * @Date: 2019/10/30 10:50
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();
        long k = scanner.nextLong();
        long end;
        long count = 0L;
        if(k==0){
            count = count * count;
        }else{
            for(long i=k+1; i<=N;i++){
                count += (N/i)*(i-k);
                end = N - (N/i)*(i);
                end = end-k;
                count += end>=0?end+1:0;
            }
        }
        System.out.println(count);
        scanner.close();
    }
}
