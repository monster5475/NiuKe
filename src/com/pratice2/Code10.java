package com.pratice2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 二分查找。。 scanner 里面不要在操作了
 * @author: wyh
 * @Date: 2019/10/30 10:50
 */
public class Code10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] apple = new int[n];
        apple[0] = scanner.nextInt();
        for(int i=1;i<n;i++){
            apple[i] = scanner.nextInt() + apple[i-1];
        }
        int m =scanner.nextInt();
        int[] q = new int[m];
        for(int i=0;i<m;i++){
            q[i] = scanner.nextInt();
        }
        int index = 0;
        for(int i=0;i<m;i++) {
            index = Arrays.binarySearch(apple, q[i]);
            if (index>0) {
                System.out.println(index+1);
            }else{
                System.out.println(-index);
            }
        }
        scanner.close();
    }
}
