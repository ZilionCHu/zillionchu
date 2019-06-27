package com.github.zilionchu.test.zilionchutest.guava.event.eventTest;

import com.github.zilionchu.test.zilionchutest.guava.event.QueryService;
import com.github.zilionchu.test.zilionchutest.guava.event.RequestHandler;
import com.google.common.eventbus.EventBus;

/**
 * @Auther: ZiLlionChu
 * @Date: 2019-06-25 10:44
 * @Description:
 */
public class ServiceListener {

    public static void main(String[] args) {
        EventBus eventBus = new EventBus();

        QueryService queryService = new QueryService(eventBus);
        eventBus.register(new RequestHandler(eventBus));
        // eventBus.post();
        queryService.queryNum("AAAAAAAAAAAABBBBBBBBBB");


    }
}
