package com.github.zillionchu.sso.zillionchusso;

import com.github.zillionchu.conf.core.annotation.XxlConf;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
//@EnableEurekaClient
@EnableDiscoveryClient
public class ZillionchuSsoApplication_8003 extends SpringBootServletInitializer implements
        EmbeddedServletContainerCustomizer {


    @XxlConf("zillionchu-sso-8003.spring.server.port")
    public int port;

    public static void main(String[] args) {
        SpringApplication.run(ZillionchuSsoApplication_8003.class, args);
    }

    @Override
    public void customize(ConfigurableEmbeddedServletContainer configurableEmbeddedServletContainer) {
        configurableEmbeddedServletContainer.setPort(port);
    }

//    @Bean
//    public BCryptPasswordEncoder encoder(){
//        return new BCryptPasswordEncoder();
//    }

}

