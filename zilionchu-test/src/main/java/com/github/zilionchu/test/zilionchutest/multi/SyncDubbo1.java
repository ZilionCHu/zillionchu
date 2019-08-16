package com.github.zilionchu.test.zilionchutest.multi;

/**
 * @Auther: ZiLlionChu
 * @Date: 2019-08-14 13:50
 * @Description:
 */
public class SyncDubbo1 {

    public synchronized void method1() {
        System.out.println("method1..");
        method2();
    }

    public synchronized void method2() {
        System.out.println("method2..");
        method3();
    }

    public synchronized void method3() {
        System.out.println("method3..");
    }

    public static void main(String[] args) {
        final SyncDubbo1 sd = new SyncDubbo1();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                sd.method1();
            }
        });
        t1.start();
    }
}
