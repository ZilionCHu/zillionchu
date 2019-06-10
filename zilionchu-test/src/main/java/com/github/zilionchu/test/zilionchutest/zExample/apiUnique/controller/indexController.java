package com.github.zilionchu.test.zilionchutest.zExample.apiUnique.controller;

import com.github.zilionchu.test.zilionchutest.zExample.apiUnique.RequestApiUniqueToken;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: ZiLlionChu
 * @Date: 2019-06-10 13:55
 * @Description:
 */

@RestController
@RequestMapping
public class indexController {

    @RequestMapping("indexApi")
    @RequestApiUniqueToken
    public String index() {
        return "Index....11";
    }

}
