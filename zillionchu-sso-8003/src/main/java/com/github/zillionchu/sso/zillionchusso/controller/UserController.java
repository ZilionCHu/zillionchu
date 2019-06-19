package com.github.zillionchu.sso.zillionchusso.controller;

import com.github.zillionchu.conf.core.annotation.XxlConf;
import com.github.zillionchu.sso.zillionchusso.biz.Service8005;
import com.github.zillionchu.sso.zillionchusso.hystrix.UserHystrixCommand;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @Auther: ZiLlionChu
 * @Date: 2019/1/22 17:01
 * @Description:
 */
@RequestMapping
@RestController
@Api(tags = "用户接口8003")
public class UserController {

//    @Autowired
//    private BCryptPasswordEncoder encoder;


    @XxlConf("zillionchu-sso-8003.demo.a01")
    public String param;


    @Autowired
    private Service8005 service8005;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    @ApiOperation(value = "登陆", notes = "登陆")
    public Object getUser(HttpServletRequest request) {
        //JSONObject post8005 = service8005.getPost8005();
        ///JSONObject post8005 = service8005.getPost8005();
        UserHystrixCommand userHystrixCommand = new UserHystrixCommand(service8005);
       // userHystrixCommand.execute();
        System.out.println("running 8003  getUser--");
        // return "post is get 8005 json " + post8005 + " and get admin param is " + param;
        return userHystrixCommand.execute();
    }


    @RequestMapping(value = "/quit", method = RequestMethod.GET)
    @ApiOperation(value = "退出", notes = "退出")
    public String getQuit() {
        return "退出8003";
    }
}
