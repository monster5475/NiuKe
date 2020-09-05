package com.shixi.kuaishouA;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @author: wyh
 * @Day: 2020/3/15
 */
public class Code1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String str = scanner.next();
        Queue<Integer> queue = new LinkedList<>();
        int length = str.length();
        int count =0, sum=0;
        int lastBegin = -1;
        int begin=0;
        int ii=0;
        for(ii=0;ii<length;ii++){
            if(str.charAt(ii)=='1'){
                count+=1;
            }
        }
        if(count>=n){
            count=0;
            int i=0;
            boolean flag= true;
            while(count<n){
                if(str.charAt(i)=='1'){
                    count+=1;
                    queue.offer(i);
                }
                if(count==1&&flag){
                    begin=i;
                    flag=false;
                }
                i++;
            }
            sum+=1;
            sum+=begin-lastBegin-1;
            for(int j=i;j<length;j++){
                if(str.charAt(j)=='0'){
                    sum+=1;
                    sum+=Math.max(begin-lastBegin-1, 0);
                }else{
                    sum+=1;
                    queue.offer(j);
                    lastBegin = queue.poll();
                    begin=queue.peek();
                    sum+=Math.max(begin-lastBegin-1, 0);
                }
            }
        }else{
            sum=0;
        }
        System.out.println(sum);
        scanner.close();
    }
}
