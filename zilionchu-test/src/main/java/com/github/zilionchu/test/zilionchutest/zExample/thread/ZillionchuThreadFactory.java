package com.github.zilionchu.test.zilionchutest.zExample.thread;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @Auther: ZiLlionChu
 * @Date: 2019-05-22 17:01
 * @Description:
 */
public class ZillionchuThreadFactory implements ThreadFactory {

    private static final ThreadGroup threadGroup = new ThreadGroup("ZillionChu");

    private final AtomicLong threadNumber = new AtomicLong(1);

    private final String namePrefix;

    private final boolean daemon;


    public ZillionchuThreadFactory(String namePrefix, boolean daemon) {
        this.namePrefix = namePrefix;
        this.daemon = daemon;
    }


    @Override
    public Thread newThread(Runnable r) {
        Thread thread = new Thread(threadGroup, r, threadGroup.getName() + "_" + namePrefix + "_#" + threadNumber
                .getAndIncrement());
        thread.setDaemon(daemon);
        if (thread.getPriority() != Thread.NORM_PRIORITY) {
            thread.setPriority(Thread.NORM_PRIORITY);
        }
        return thread;
    }
}
