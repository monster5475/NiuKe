package com.mianshi.test.thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author: wyh
 * @Day: 2020/3/28
 */
public abstract class MyCounterThread implements Runnable{

    public MyNumber myNumber;
    public ReentrantLock lock;
    public Condition conditionString;
    public Condition conditionNumber;

    public MyCounterThread(MyNumber myNumber, ReentrantLock lock, Condition conditionNumber, Condition conditionString){
        this.myNumber = myNumber;
        this.lock = lock;
        this.conditionNumber = conditionNumber;
        this.conditionString = conditionString;
    }
}
