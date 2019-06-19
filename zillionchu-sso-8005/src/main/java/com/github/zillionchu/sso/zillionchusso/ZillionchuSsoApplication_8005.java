package com.github.zillionchu.sso.zillionchusso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class ZillionchuSsoApplication_8005 extends SpringBootServletInitializer {


    public static void main(String[] args) {
        SpringApplication.run(ZillionchuSsoApplication_8005.class, args);
    }


}

