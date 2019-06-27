package com.github.zilionchu.test.zilionchutest.guava.event;

import com.github.zilionchu.core.zillionchucore.log.LoggerBase;
import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;

/**
 * @Auther: ZiLlionChu
 * @Date: 2019-06-25 10:30
 * @Description:
 */
public class QueryService implements LoggerBase {

    private EventBus eventBus;

    public QueryService(EventBus eventBus) {
        this.eventBus = eventBus;
        this.eventBus.register(this);
    }

    public void queryNum(String num) {
        info("  serache  num  is {}", num);
        this.eventBus.post(new Request(num));
    }

    @Subscribe
    public void handleResponse(Response response) {
        info("###QueryService response {}", response);
    }

}
