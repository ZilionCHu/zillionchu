package com.github.zilionchu.test.zilionchutest.zExample.event;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @Auther: ZiLlionChu
 * @Date: 2019-05-22 14:21
 * @Description:
 */

@Component
public class UserListener {


    @EventListener
    public void userListener(UserEvent event) {

        String userString = event.getUserString();
        System.out.println("UserEvent#getlistener....................." + userString);

    }
}
