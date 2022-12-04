package com.example.cyjworkflow;

import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication;
import org.mybatis.spring.annotation.MapperScan;
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
@EnableProcessApplication
@EnableEurekaClient
@EnableFeignClients
@EntityScan(value = "com.example")
@ComponentScan(value = "com.example")
@MapperScan("com.example.cyjcommon.mapper")
public class CyjWorkflowApplication {

    public static void main(String[] args) {
        SpringApplication.run(CyjWorkflowApplication.class, args);
    }

}
