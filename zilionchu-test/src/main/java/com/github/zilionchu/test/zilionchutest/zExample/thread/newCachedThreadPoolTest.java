package com.github.zilionchu.test.zilionchutest.zExample.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Auther: ZiLlionChu
 * @Date: 2019-08-12 11:09
 * @Description: 创建一个可缓存线程池，如果线程池长度超过处理需要，可灵活回收空闲线程，若无可回收，则新建线程。
 * 线程池为无限大，当执行第二个任务时第一个任务已经完成，会复用执行第一个任务的线程，而不用每次新建线程。
 */
public class newCachedThreadPoolTest {

    public static void main(String[] args) {

        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();

        for (int i = 0; i < 10; i++) {
            final int temp = i;
            cachedThreadPool.execute(new Runnable() {
                @Override
                public void run() {
//                    try {
//                        TimeUnit.NANOSECONDS.sleep(1);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }

                    System.out.println(Thread.currentThread().getId() + ",i" + temp);
                }
            });


        }

    }


}
