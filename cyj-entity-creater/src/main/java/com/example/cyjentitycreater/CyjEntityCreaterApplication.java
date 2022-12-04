package com.example.cyjentitycreater;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Noice
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EntityScan("com.example")
@ComponentScan("com.example")
public class CyjEntityCreaterApplication {

    public static void main(String[] args) {
        SpringApplication.run(CyjEntityCreaterApplication.class, args);
    }
}
