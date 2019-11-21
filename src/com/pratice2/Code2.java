package com.pratice2;

// https://www.nowcoder.com/ta/2019test

import java.util.Scanner;

/**
 * @author: wyh
 * @Date: 2019/10/30 10:50
 */
public class Code2 {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int l = scanner.nextInt();
//        int r = scanner.nextInt();
//        long sum = 0;
//        long begin = ((l+2)/3)*3;
//        long end = ((r-1)/3)*3;
//        sum += (end-begin) /3 *2;
//        long countL = l%3==0?1:2;
//        long countR = (r%3+2)%3;
//        sum+= countL+countR;
//        System.out.println(sum);
//        scanner.close();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            Long a = scanner.nextLong();
            Long b = scanner.nextLong();
            Long number = b - a + 1;
            Long res;
            if (b - a == 0) {
                if ((b - 1) % 3 == 0) {
                    res = 0L;
                } else {
                    res = 1L;
                }
            } else {
                res = number - number / 3;
                if ((b - 1) % 3 == 0 && (a - 1) % 3 == 0) {
                    res -= 1;
                }
            }
            System.out.println(res);
        }
        scanner.close();
    }
}
