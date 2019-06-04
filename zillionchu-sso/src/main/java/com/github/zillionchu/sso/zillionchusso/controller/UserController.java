package com.github.zillionchu.sso.zillionchusso.controller;

import com.github.zillionchu.sso.zillionchusso.bean.test02;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
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
@Slf4j
public class UserController {

//    @Autowired
//    private BCryptPasswordEncoder encoder;

    private Logger logger = LoggerFactory.getLogger(UserController.class);

    @Value("${ent.test}")
    private String test;

    @RequestMapping("/user")
    //@Cache
    public String getUser(HttpServletRequest request) {

        System.out.println("----------:" + test);

        System.out.println("console--进来了。。。。。。。。8002");
        //System.out.println("进来了。。。。。。。。8002");
        logger.info("info--进来了。。。。。。。。8002");

        if (logger.isDebugEnabled()) {

            logger.debug("bebug--进来了。。。。。。。。8002");
        }
        log.debug("--logmok--bebug--进来了。。。。。。。。8002");

        test02 test02 = new test02();
        test02.setUsername("username jack");
        test02.setTestage("testage  10");

        log.debug("test02--{}", test02.toString());

        return request.getLocalPort() + "-Username";
    }
}
