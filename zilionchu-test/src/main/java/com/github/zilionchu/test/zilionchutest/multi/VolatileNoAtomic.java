package com.github.zilionchu.test.zilionchutest.multi;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Auther: ZiLlionChu
 * @Date: 2019-08-15 10:10
 * @Description:
 */
public class VolatileNoAtomic extends Thread {

    // private static volatile int count;
    private static AtomicInteger count = new AtomicInteger(0);

    private static void addCount() {
        for (int i = 0; i < 1000; i++) {
            //count++ ;
            count.incrementAndGet();
        }
        System.out.println(count);
    }

    public void run() {
        addCount();
    }

    public static void main(String[] args) {

        VolatileNoAtomic[] arr = new VolatileNoAtomic[100];
        for (int i = 0; i < 10; i++) {
            arr[i] = new VolatileNoAtomic();
        }

        for (int i = 0; i < 10; i++) {
            arr[i].start();
        }
    }


}
