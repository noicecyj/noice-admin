package com.example.cyjuser;

import com.example.cyjcommon.utils.SpringUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2021-03-25
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableJpaRepositories(value = "com.example")
@EntityScan(value = "com.example")
@ComponentScan(value="com.example")
public class CyjUserApplication {

        public static void main(String[] args) {
                SpringApplication springApplication = new SpringApplication(CyjUserApplication.class);
                ConfigurableApplicationContext configurableApplicationContext = springApplication.run(args);
                // 将Context设置到SpringUtil中
                SpringUtil.setApplicationContext(configurableApplicationContext);
        }


}
