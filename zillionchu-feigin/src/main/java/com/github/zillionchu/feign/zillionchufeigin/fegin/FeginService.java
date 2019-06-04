package com.github.zillionchu.feign.zillionchufeigin.fegin;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: ZiLlionChu
 * @Date: 2019/3/1 15:52
 * @Description:
 */
@FeignClient(name = "zillionchu-sso",serviceId = "zillionchu-sso",fallback = FeginService.FeginServiceFallBack.class)
public interface FeginService {

    //zillionchu-sso

    @RequestMapping("/user")
    public String getUser();

    @Component
    static class  FeginServiceFallBack implements FeginService{

        @Override
        public String getUser(){
            //Integer
            return "feign go  sso  is  error";
        }
    }


}
