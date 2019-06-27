package com.github.zilionchu.test.zilionchutest.guava.event.eventTest;

import com.github.zilionchu.test.zilionchutest.guava.event.DeadEventListenner;
import com.google.common.eventbus.EventBus;

/**
 * @Auther: ZiLlionChu
 * @Date: 2019-06-25 09:50
 * @Description:
 */
public class DeadEventListennerTest {

    public static void main(String[] args) {
        EventBus eventBus = new EventBus("DeadEventBus") {
            @Override
            public String toString() {
                return "DEAD-EVENT-BUS";
            }
        };
        eventBus.register(new DeadEventListenner());
        eventBus.post("HHHI...");
    }
}
