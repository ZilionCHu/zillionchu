package com.github.zillionchu.sso.zillionchusso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class ZillionchuSsoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZillionchuSsoApplication.class, args);
    }


}

