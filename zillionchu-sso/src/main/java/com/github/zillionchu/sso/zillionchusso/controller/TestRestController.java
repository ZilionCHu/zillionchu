package com.github.zillionchu.sso.zillionchusso.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: ZiLlionChu
 * @Date: 2019/3/12 13:26
 * @Description:
 */
@RestController("/hr/")
public class TestRestController {



    @RequestMapping("api")
    public String getIndex(){
        return "index";
    }

}
