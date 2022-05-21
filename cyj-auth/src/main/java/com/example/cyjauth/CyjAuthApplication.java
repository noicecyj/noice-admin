package com.example.cyjauth;

import com.example.cyjcommon.utils.SpringUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author Noice
 * @version 1.0
 * @date 2020/1/21 14:46
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableZuulProxy
@EnableJpaRepositories(value = "com.example")
@EntityScan(value = "com.example")
@ComponentScan(value = "com.example")
public class CyjAuthApplication {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(CyjAuthApplication.class);
        ConfigurableApplicationContext configurableApplicationContext = springApplication.run(args);
        // 将Context设置到SpringUtil中
        SpringUtil.setApplicationContext(configurableApplicationContext);
    }

}
