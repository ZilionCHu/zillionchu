package com.github.zilionchu.test.zilionchutest.guava.event.eventTest;

import com.github.zilionchu.core.zillionchucore.log.LoggerBase;
import com.github.zilionchu.test.zilionchutest.guava.event.SimpleListener;
import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.SubscriberExceptionContext;
import com.google.common.eventbus.SubscriberExceptionHandler;

/**
 * @Auther: ZiLlionChu
 * @Date: 2019-06-25 09:12
 * @Description:
 */
public class SimpleListenerTest implements LoggerBase {
    public static void main(String[] args) {

        EventBus eventBus = new EventBus(new ExceptionHandler());
        eventBus.register(new SimpleListener());
        eventBus.post(" # post SimpleListenerTest String #");

    }


    static class ExceptionHandler implements SubscriberExceptionHandler, LoggerBase {

        @Override
        public void handleException(Throwable throwable, SubscriberExceptionContext context) {

            info("###-ExceptionHandler to SimpleListener  getSubscriberMethod {}", context
                    .getSubscriberMethod());
            info("###-ExceptionHandler to SimpleListener  getSubscriber {}", context
                    .getSubscriber());
            info("###-ExceptionHandler to SimpleListener  Event {}", context
                    .getEvent());
            info("###-ExceptionHandler to SimpleListener  EventBus {}", context
                    .getEventBus());
        }
    }
}
