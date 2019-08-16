package com.github.zilionchu.test.zilionchutest.multi;

/**
 * @Auther: ZiLlionChu
 * @Date: 2019-08-14 15:30
 * @Description:
 */
public class DeadLock01 implements Runnable {

    private static Object lock1 = new Object();
    private static Object lock2 = new Object();


    private String tag;

    public void setTag(String tag) {
        this.tag = tag;
    }


    @Override
    public void run() {
        if ("a".equals(tag)) {
            synchronized (lock1) {
                System.out.println("======thread name is:" + Thread.currentThread().getName() + " ==tag:" + tag);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized (lock2) {
                    System.out.println("======thread name is" + Thread.currentThread().getName() + " ==tag:" + tag);

                }
            }
        }
        if ("b".equals(tag)) {

            synchronized (lock2) {

                System.out.println("======thread name is" + Thread.currentThread().getName() + " ==tag:" + tag);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock1) {

                    System.out.println("======thread name is" + Thread.currentThread().getName() + " ==tag:" + tag);
                }

            }

        }

    }

    public static void main(String[] args) {
        DeadLock01 deadLock01 = new DeadLock01();
        deadLock01.setTag("a");
        DeadLock01 deadLock02 = new DeadLock01();
        deadLock02.setTag("b");
        Thread t1 = new Thread(deadLock01, "t1");
        Thread t2 = new Thread(deadLock02, "t2");
        t1.start();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();


    }
}
