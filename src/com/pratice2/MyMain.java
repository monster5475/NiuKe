package com.pratice2;

// https://www.nowcoder.com/ta/2019test

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author: wyh
 * @Date: 2019/10/30 10:50
 */
public class MyMain {

    public static class Work{
        public double d;
        public double p;
        public Work(double d, double p){
            this.d = d;
            this.p = p;
        }

        public Work(){
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N,M;
        N = scanner.nextInt();
        M = scanner.nextInt();
        ArrayList<Work> works = Stream
                .generate(Work::new)
                .limit(N+M).collect(Collectors.toCollection(ArrayList::new));
        for(int i=0; i<N; i++){
            Work work = works.get(i);
            work.d = scanner.nextDouble();
            work.p = scanner.nextDouble();
        }
        works.sort((work1, work2)->Double.doubleToLongBits(work1.d)>Double.doubleToLongBits(work2.d)?1:-1);
        double A;
        for(int i=0; i<M; i++){
            A = scanner.nextDouble();
            Work work = works.get(N+i);
            work.d = M;
            double max=Double.MIN_VALUE;
            for(Work work:works){
                if(A >= work.d){
                    max = Math.max(max, work.p);
                }else{
                    break;
                }
            }
            System.out.println((int)max);
        }
    }
}
