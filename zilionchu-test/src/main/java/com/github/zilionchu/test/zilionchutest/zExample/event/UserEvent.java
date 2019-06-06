package com.github.zilionchu.test.zilionchutest.zExample.event;

import org.springframework.context.ApplicationEvent;

/**
 * @Auther: ZiLlionChu
 * @Date: 2019-05-22 14:03
 * @Description:
 */
public class UserEvent extends ApplicationEvent {


    public UserEvent(Object source) {
        super(source);
    }

    public String getUserString() {
        return (String) this.source;
    }
}
