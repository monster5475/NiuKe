package com.mianshi.test.thread;

import java.util.Random;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author: wyh
 * @Day: 2020/3/28
 */
public class MyStringCount extends MyCounterThread {
    public MyStringCount(MyNumber myNumber, ReentrantLock lock, Condition conditionNumber, Condition conditionString) {
        super(myNumber, lock, conditionNumber, conditionString);
    }

    @Override
    public void run() {
        for(;;){
            try {
                lock.lock();
                conditionNumber.signalAll();
                System.out.println(myNumber.str);
                myNumber.str = myNumber.str+(char)(new Random().nextInt()%26+'A');
                conditionString.await();
                if(myNumber.str.length() == 10){
                    System.out.println("我是string，我逃出来了, 我让number也跑吧");
                    conditionNumber.signalAll();
                    break;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                lock.unlock();
            }
        }
    }
}
