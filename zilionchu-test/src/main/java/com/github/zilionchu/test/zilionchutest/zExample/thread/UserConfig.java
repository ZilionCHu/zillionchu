package com.github.zilionchu.test.zilionchutest.zExample.thread;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @Auther: ZiLlionChu
 * @Date: 2019-05-22 16:48
 * @Description:
 */
@Component
public class UserConfig {


    private static final int HEALTH_CHECK_INTERVAL = 50 * 100;

    @PostConstruct
    public void init() {

        ScheduledExecutorService userThread = Executors.newScheduledThreadPool(5, new ZillionchuThreadFactory
                ("userThread", true));

        userThread.scheduleWithFixedDelay(new userThreadCheck(), 1000, HEALTH_CHECK_INTERVAL,
                TimeUnit.MILLISECONDS);
        System.out.println("init##########################################");


      //  Executors.new
    }

    private class userThreadCheck implements Runnable {

        @Override
        public void run() {

            System.out.println("线程ID==" + Thread.currentThread().getId() + "-#线程Name#-" + Thread.currentThread()
                    .getName()
                    + "...............running..........");
        }
    }
}
