package com.github.zillionchu.sso.zillionchusso.controller;

import com.github.zillionchu.conf.core.annotation.XxlConf;
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


    @XxlConf("zillionchu-sso-8003.demo.a01")
    public String param;

    @RequestMapping("/user")
    public String getUser(HttpServletRequest request) {

//        System.out.println("进来了。。。。。。。。8003");
//
//        try {
//            Thread.sleep(600000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        System.out.println(param);

        return request.getLocalPort() + "-Username---配置中心参数"+param;
    }
}
