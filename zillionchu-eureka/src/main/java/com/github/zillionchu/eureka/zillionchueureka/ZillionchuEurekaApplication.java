package com.github.zillionchu.eureka.zillionchueureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ZillionchuEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZillionchuEurekaApplication.class, args);



//        ConfigurableApplicationContext commonContext =
//                new SpringApplicationBuilder(ZillionchuEurekaApplication.class).web(WebApplicationType.NONE).run(args);


    }

}

