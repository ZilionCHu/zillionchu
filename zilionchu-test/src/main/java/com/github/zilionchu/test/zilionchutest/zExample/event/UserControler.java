package com.github.zilionchu.test.zilionchutest.zExample.event;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: ZiLlionChu
 * @Date: 2019-05-22 13:53
 * @Description:
 */

@RestController
@RequestMapping
public class UserControler {

    private final ApplicationEventPublisher publisher;

    public UserControler(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }

//    @Autowired
//    private ApplicationEventPublisher publisher;

    @RequestMapping("index")
    public String getString() {
        publisher.publishEvent(new UserEvent("我在访问--userController"));
        return "index";
    }

}
