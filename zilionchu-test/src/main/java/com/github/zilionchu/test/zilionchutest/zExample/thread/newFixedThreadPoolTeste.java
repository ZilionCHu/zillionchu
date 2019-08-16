package com.github.zilionchu.test.zilionchutest.zExample.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @Auther: ZiLlionChu
 * @Date: 2019-08-12 11:18
 * @Description: 创建一个定长线程池，可控制线程最大并发数，超出的线程会在队列中等待。
 * 因为线程池大小为3，每个任务输出index后sleep 2秒，所以每两秒打印3个数字。
 * 定长线程池的大小最好根据系统资源进行设置。如Runtime.getRuntime().availableProcessors()
 */
public class newFixedThreadPoolTeste {

    public static void main(String[] args) {

        //System.out.println(Runtime.getRuntime().availableProcessors());
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(2);

        for (int i = 0; i < 10; i++) {
            final int temp = i;
            fixedThreadPool.execute(new Runnable() {
                @Override
                public void run() {
                    try {
                        TimeUnit.SECONDS.sleep(5);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("threadId=" + Thread.currentThread().getId() + ",i=" + temp);
                }
            });

        }
    }
}
