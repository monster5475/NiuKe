package com.pratice2;

// https://www.nowcoder.com/ta/2019test

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @author: wyh
 * @Date: 2019/10/30 10:50
 */
public class Code1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N,M;
        N = scanner.nextInt();
        M = scanner.nextInt();
        HashMap<Long, Long> map = new HashMap<>();
        Long[] a = new Long[N+M];
        for(int i=0; i<N; i++){
            Long d = scanner.nextLong();
            Long p = scanner.nextLong();
            map.put(d, p);
            a[i] = d;
        }
        Long[] c = new Long[M];
        for(int i=0; i<M; i++){
            Long t = scanner.nextLong();
            if(!map.containsKey(t)) {
                map.put(t, 0L);
            }
            c[i] = t;
            a[i+N] = t;
        }
        Arrays.sort(a);
        Long max = Long.MIN_VALUE;
        for(int i=0;i<N+M;i++){
            max = Math.max(max, map.get(a[i]));
            map.put(a[i], max);
        }
        for(int i=0;i<M;i++){
            System.out.println(map.get(c[i]));
        }
    }
}
