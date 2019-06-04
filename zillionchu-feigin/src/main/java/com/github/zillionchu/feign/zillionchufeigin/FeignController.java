package com.github.zillionchu.feign.zillionchufeigin;

import com.github.zillionchu.feign.zillionchufeigin.fegin.FeginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: ZiLlionChu
 * @Date: 2019/3/1 15:55
 * @Description:
 */
@RestController
//@DefaultProperties(defaultFallback = "defaultFallback")
public class FeignController {

    @Autowired
    FeginService feginService;

//    @HystrixCommand(commandProperties = {
//            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds" ,value = "3000")
//    })
    @RequestMapping("/feign")
    public String getUser() {

        String user = feginService.getUser();
        return user;

    }

//    public String fallBack(){
//        return "error is server-sso";
//    }
//
//
//    public String defaultFallback(){
//
//        return "default error is server-sso" ;
//    }
}
