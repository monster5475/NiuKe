package com.mianshi.test.thread;

import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author: wyh
 * @Day: 2020/3/28
 */
public class MyThreadMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyNumber myNumber = new MyNumber(1, "A");
        ReentrantLock lock = new ReentrantLock();
        Condition conditionNumber = lock.newCondition();
        Condition conditionString = lock.newCondition();
        BlockingQueue queue = new ArrayBlockingQueue(10);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
                2,4,100, TimeUnit.HOURS, queue);
        threadPoolExecutor.execute(new MyNumberCount(myNumber, lock, conditionNumber, conditionString));
        threadPoolExecutor.execute(new MyStringCount(myNumber, lock, conditionNumber, conditionString));
//        Thread thread1 = new Thread(new MyStringCount(myNumber, lock, conditionNumber, conditionString));
//        Thread thread2 = new Thread(new MyNumberCount(myNumber, lock, conditionNumber, conditionString));
//        thread1.setName("thread1");
//        thread2.setName("thread2");
//        thread1.start();
//        thread2.start();
//        scanner.close();
    }
}
