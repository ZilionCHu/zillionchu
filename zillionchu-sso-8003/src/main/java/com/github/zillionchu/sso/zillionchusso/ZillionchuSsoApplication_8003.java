package com.github.zillionchu.sso.zillionchusso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
//@EnableEurekaClient
@EnableDiscoveryClient
public class ZillionchuSsoApplication_8003 {

    public static void main(String[] args) {
        SpringApplication.run(ZillionchuSsoApplication_8003.class, args);
    }

//    @Bean
//    public BCryptPasswordEncoder encoder(){
//        return new BCryptPasswordEncoder();
//    }

}

