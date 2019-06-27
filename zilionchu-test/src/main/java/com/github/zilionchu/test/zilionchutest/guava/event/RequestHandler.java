package com.github.zilionchu.test.zilionchutest.guava.event;

import com.github.zilionchu.core.zillionchucore.log.LoggerBase;
import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;

/**
 * @Auther: ZiLlionChu
 * @Date: 2019-06-25 10:39
 * @Description:
 */
public class RequestHandler implements LoggerBase {


    private final EventBus eventBus;

    public RequestHandler(EventBus eventBus) {
        this.eventBus = eventBus;

    }

    @Subscribe
    public void doQuery(Request request) {
        info("###RequestHandler  doQuery  {}", request.toString());
        Response response = new Response();
        this.eventBus.post(response);
    }
}
