package com.github.zillionchu.sso.zillionchusso.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Auther: ZiLlionChu
 * @Date: 2019-06-18 14:18
 * @Description: http://localhost:8003/swagger-ui.html
 */
@Configuration
@EnableSwagger2
public class Swagger2Config {


    private final static String pagePath = "com.github.zillionchu.sso.zillionchusso.controller";
    private final static String version = "1.0.1";

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage(pagePath))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("ZillionChu-API")
                .description("ZillionChu-API")
                .termsOfServiceUrl("")
                .contact("ZillionChu")
                .version(version)
                .build();
    }
}


