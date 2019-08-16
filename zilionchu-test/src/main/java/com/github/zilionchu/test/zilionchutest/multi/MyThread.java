package com.github.zilionchu.test.zilionchutest.multi;

/**
 * @Auther: ZiLlionChu
 * @Date: 2019-08-14 09:12
 * @Description:
 */
public class MyThread extends Thread {

    int count = 5;


    @Override
    public synchronized void run() {
        //

        count--;

        System.out.println(Thread.currentThread().getName() + "--" + "count is : " + count);
    }


    public static void main(String[] args) {

        MyThread myThread1 = new MyThread();

        Thread thread1 = new Thread(myThread1, "t1");
        Thread thread2 = new Thread(myThread1, "t2");
        Thread thread3 = new Thread(myThread1, "t3");
        Thread thread4 = new Thread(myThread1, "t4");
        Thread thread5 = new Thread(myThread1, "t5");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();


    }


}
