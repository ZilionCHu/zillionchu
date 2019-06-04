package com.github.zillionchu.sso.zillionchusso.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @Auther: ZiLlionChu
 * @Date: 2019/1/22 17:01
 * @Description:
 */
@RequestMapping
@RestController
public class UserController {

//    @Autowired
//    private BCryptPasswordEncoder encoder;

    @RequestMapping("/user")
    public String getUser(HttpServletRequest request) {

        System.out.println("进来了。。。。。。。。8003");

        try {
            Thread.sleep(600000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return request.getLocalPort()+ "-Username";
    }
}
