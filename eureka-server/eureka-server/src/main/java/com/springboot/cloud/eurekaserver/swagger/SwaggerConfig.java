package com.springboot.cloud.eurekaserver.swagger;



import static springfox.documentation.builders.PathSelectors.regex;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configurable
@EnableSwagger2
public class SwaggerConfig {

	@Bean
    public Docket employeeApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select().apis(RequestHandlerSelectors.basePackage("com.springboot.cloud.eurekaserver.controller"))
                .paths(regex("/rest/server/employees"))
                .build();
            
    }


}
