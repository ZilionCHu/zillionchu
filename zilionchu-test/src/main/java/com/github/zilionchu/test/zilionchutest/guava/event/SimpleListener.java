package com.github.zilionchu.test.zilionchutest.guava.event;

import com.github.zilionchu.core.zillionchucore.log.LoggerBase;
import com.google.common.eventbus.Subscribe;

/**
 * @Auther: ZiLlionChu
 * @Date: 2019-06-25 08:48
 * @Description:
 */
public class SimpleListener implements LoggerBase {

    @Subscribe
    public void m1(String param) {
        info("method  m1  copy parm  from event {}", param);
    }

    @Subscribe
    public void m2(String param) {
        info("methos  m2   copy parm  from event {}", param);
    }

    @Subscribe
    public void m3(String param) {

        // info("methos  m3   copy parm  from event {}", param);
        throw new RuntimeException();
    }

}
