package com.mianshi.meituan;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author: wyh
 * @Day: 2020/3/19
 */
public class Code3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int m = scanner.nextInt();
        int p = scanner.nextInt();
        int q = scanner.nextInt();
        int[] numbers = new int[k];
        int sum = 0;
        for(int i=0;i<k;i++){
            numbers[i] = scanner.nextInt();
            sum+=numbers[i];
        }
        int score = 0;
        Arrays.sort(numbers);
        int mm = m;
        int circle = mm/sum;
        mm = mm%sum;
        score = circle*(p*k+q);
        int[] count= new int[n];
        for(int i =0;i<n;i++){
            count[i] = circle;
        }
        int i=0;
        while(mm>0){
            if(mm>=numbers[i]){
                if (count[i] < n) {
                    score+=p;
                    count[i]+=1;
                    mm-=numbers[i];
                }else{
                    i+=1;
                }
            }else{
                break;
            }
        }
        int score1 = score;
        int score2 = 0;
        int[] count2= new int[n];
        int mm2= m;
        i=0;
        while(mm2>0){
            if(mm2>=numbers[i]){
                if (count2[i] < n) {
                    score2+=p;
                    count2[i]+=1;
                    mm2-=numbers[i];
                }else{
                    i+=1;
                }
            }else{
                break;
            }
        }
        int min = Integer.MAX_VALUE;
        for(int j=0;j<k;j++){
            min = Math.min(count[j], min);
        }
        score2 += min*q;
        System.out.println(Math.max(score1, score2));
        scanner.close();
    }
}
