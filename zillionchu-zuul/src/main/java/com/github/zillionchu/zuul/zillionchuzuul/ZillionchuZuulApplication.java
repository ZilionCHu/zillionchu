package com.github.zillionchu.zuul.zillionchuzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;


@EnableZuulProxy
//@EnableEurekaClient
@SpringBootApplication
public class ZillionchuZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZillionchuZuulApplication.class, args);
    }

}

