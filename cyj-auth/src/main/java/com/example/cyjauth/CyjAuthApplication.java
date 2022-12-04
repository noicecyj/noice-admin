package com.example.cyjauth;

import com.example.cyjcommon.utils.SpringUtil;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Noice
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableZuulProxy
@EntityScan(value = "com.example")
@ComponentScan(value = "com.example")
@MapperScan("com.example.cyjcommon.mapper")
public class CyjAuthApplication {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(CyjAuthApplication.class);
        ConfigurableApplicationContext configurableApplicationContext = springApplication.run(args);
        // 将Context设置到SpringUtil中
        SpringUtil.setApplicationContext(configurableApplicationContext);
    }

}
