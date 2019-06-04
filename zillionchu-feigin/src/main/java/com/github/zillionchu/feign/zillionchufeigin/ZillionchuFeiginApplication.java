package com.github.zillionchu.feign.zillionchufeigin;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

//@SpringBootApplication
@EnableFeignClients
//@EnableDiscoveryClient
//@EnableHystrix
//@EnableCircuitBreaker

@SpringCloudApplication
public class ZillionchuFeiginApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZillionchuFeiginApplication.class, args);
    }

}
