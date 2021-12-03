package com.example.cyjentitycreater;

import com.example.cyjcommon.service.MessageProvider;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.stream.annotation.EnableBinding;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2020/1/21 14:46
 */
@EnableBinding(MessageProvider.class)
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class CyjEntityCreaterApplication {

        public static void main(String[] args) {
                SpringApplication.run(CyjEntityCreaterApplication.class, args);
        }
}
