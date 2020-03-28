package com.mianshi.test.thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author: wyh
 * @Day: 2020/3/28
 */
public class MyNumberCount extends MyCounterThread {

    public MyNumberCount(MyNumber myNumber, ReentrantLock lock, Condition conditionNumber, Condition conditionString) {
        super(myNumber, lock, conditionNumber, conditionString);
    }

    @Override
    public void run() {
        for(;;){
            try {
                lock.lock();
                conditionString.signalAll();
                System.out.println(myNumber.number);
                myNumber.number++;
                conditionNumber.await();
                if(myNumber.number==10){
                    System.out.println("我是Number，我逃出来了");
                    conditionString.signalAll();
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
