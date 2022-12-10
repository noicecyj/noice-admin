package com.example.cyjworkflow;

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
public class CyjWorkflowApplication {

    public static void main(String[] args) {
        SpringApplication.run(CyjWorkflowApplication.class, args);
    }

}
