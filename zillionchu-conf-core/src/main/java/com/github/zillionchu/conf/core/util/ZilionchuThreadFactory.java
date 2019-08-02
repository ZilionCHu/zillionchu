package com.github.zillionchu.conf.core.util;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @Auther: ZiLlionChu
 * @Date: 2019-06-28 19:18
 * @Description:
 */
public class ZilionchuThreadFactory implements ThreadFactory {

    private static final ThreadGroup threadGroup = new ThreadGroup("ZillionCHu");

    private final String namePriex;

    private final AtomicLong atomicLong = new AtomicLong(1);

    public ZilionchuThreadFactory(String namePriex) {
        this.namePriex = namePriex;
    }

    @Override
    public Thread newThread(Runnable r) {
        String name = threadGroup.getName() + "-" + namePriex + "-" +atomicLong.getAndIncrement();
        Thread thread = new Thread(threadGroup, r, name);

        return null;
    }


}
