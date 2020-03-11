package com.pratice2;
import java.util.Scanner;
/**
 * @author: wyh
 * latex爱好者
 * @Day: 2020/3/6
 */
public class Code18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int p = scanner.nextInt();
        int h = scanner.nextInt();
        int w = scanner.nextInt();
        int number, size=0;
        int[] numbers = new int[n];
        int sum = 0;
        for(int i=0; i<n; i++){
            number = scanner.nextInt();
            numbers[i] = number;
            sum+=number;
        }
        int minLimit = Math.min(h,w);
        for(int i=minLimit;i>0;i--){
            if(i<=28){
                size=i;
            }
            int h_ = h/i,w_ = w/i;
            if(h_==0 || w_==0){
                continue;
            }
            int pageNumber = h_*w_;
            int h_sum=0;
            for(int j=0;j<numbers.length;j++){
                int h_need = (numbers[j]+w_-1)/w_;
                h_sum+=h_need;
            }
            int page = (h_sum+h_-1)/h_;
            if(page<=p){
                size = i;
                break;
            }
        }
        System.out.println(size);

        scanner.close();
    }
}