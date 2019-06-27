package com.github.zilionchu.test.zilionchutest.guava.event;

import com.github.zilionchu.core.zillionchucore.log.LoggerBase;
import com.google.common.eventbus.Subscribe;

/**
 * @Auther: ZiLlionChu
 * @Date: 2019-06-25 09:47
 * @Description:
 */
public class DeadEventListenner implements LoggerBase {


    @Subscribe
    public void m1(com.google.common.eventbus.DeadEvent event) {
        info("###DeadEventListenner is event  {}", event.getEvent());
        info("###DeadEventListenner is eventSource  {}", event.getSource());
    }
}
