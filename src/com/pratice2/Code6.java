package com.pratice2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 牛牛最晚起床时间
 * @author: wyh
 * @Date: 2019/10/30 10:50
 */
public class Code6 {

    static class Clock{
        public int h;
        public int m;
        public Clock(int h, int m){
            this.h = h;
            this.m = m;
        }
        public int compare(Clock c){
            int res=0;
            if(h<c.h){
                res = -1;
            }else if(h == c.h){
                if(m<c.m){
                    res = -1;
                }else if(m ==c.m){
                    res= 0;
                }else{
                    res = 1;
                }
            }else{
                res = 1;
            }
            return res;
        }
        public void add(int m){
            this.m += m;
            if(this.m>60){
                this.m-=60;
                this.h+=1;
            }
        }

        @Override
        protected Object clone(){
            return new Clock(this.h, this.m);
        }

        @Override
        public String toString() {
            return this.h + " " + this.m;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Clock[] cs = new Clock[n];
        int a,b;
        for(int i=0;i<n;i++){
            a = scanner.nextInt();
            b = scanner.nextInt();
            cs[i] = new Clock(a,b);
        }
        int time = scanner.nextInt();
        a = scanner.nextInt();
        b = scanner.nextInt();
        Clock des = new Clock(a,b);
        int index=0;
        Arrays.sort(cs, (c1,c2)->c1.compare(c2));
        for(int i=0;i<n;i++){
            Clock clock = (Clock) cs[i].clone();
            clock.add(time);
            if(clock.compare(des)==-1 || clock.compare(des)==0){
                index = i;
            }else{
                break;
            }
        }
        System.out.println(cs[index]);
        scanner.close();

    }
}
