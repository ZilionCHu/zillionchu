package com.github.zillionchu.sso.zillionchusso.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: ZiLlionChu
 * @Date: 2019/1/22 17:01
 * @Description:
 */
@RequestMapping("/member")
@RestController
@Api(tags = "用户接口8005")
public class UserController {


    @RequestMapping(value = "/user", method = RequestMethod.GET)
    @ApiOperation(value = "登陆", notes = "登陆")
    public Object getUser(HttpServletRequest request) throws InterruptedException {
        Map<String, Object> hashMap = new HashMap<String, Object>();
        hashMap.put("code", 200);
        hashMap.put("msgPort", "8005");
        Thread.sleep(1500);
        return hashMap;
    }


    @RequestMapping(value = "/index", method = RequestMethod.GET)
    @ApiOperation(value = "index", notes = "index")
    public String getIndex() {

        return "8005-index";
    }
}
