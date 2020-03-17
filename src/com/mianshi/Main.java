package com.mianshi;


import java.util.concurrent.locks.ReentrantLock;

/**
 * @author: wyh
 * @Day: 2020/3/11
 */
public class Main {


    public static void main(String[] args) throws InterruptedException {
        ReentrantLock lock = new ReentrantLock();
        Student student = new Student(3);
        String name1 = "thread1: ";
        String name2 = "thread2: ";
        MyThread myThread1 = new MyThread(name1, lock, student);
        MyThread myThread2 = new MyThread(name2, lock, student);
        Thread thread1 = new Thread(myThread1, "Thread1");
        Thread thread2 = new Thread(myThread1, "Thread2");
        thread1.start();
        thread2.start();

    }

    public static class Student{
        public int number;
        public Student(int number){
            this.number = number;
        }
    }

    public static class MyThread implements Runnable{
        @Override
        public void run() {
            String res ="";
            lock.lock();
            try {
                student.number += 1;
                res+=Thread.currentThread().getName();
                res += name;
                res += " student-number:" + student.number;
                System.out.println(res);
                long time1 = System.currentTimeMillis();
                long i=0;
                while(System.currentTimeMillis()<time1+50000){
                    i+=1;
                }
                System.out.println(i);
            }catch (Exception e){
                e.printStackTrace();
            }finally {
                lock.unlock();
            }


        }
        public ReentrantLock lock;
        public Student student;
        public String name;
        public MyThread(String name, ReentrantLock lock, Student student){
            this.name = name;
            this.lock = lock;
            this.student = student;
        }
    }
}
