package com.example.cyjlog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2020/1/21 14:46
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableJpaRepositories(value = "com.example")
@EntityScan(value = "com.example")
@ComponentScan(value="com.example")
public class CyjLogApplication {

        public static void main(String[] args) {
                SpringApplication.run(CyjLogApplication.class, args);
        }

}
