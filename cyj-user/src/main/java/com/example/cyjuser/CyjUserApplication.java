package com.example.cyjuser;

import com.example.cyjcommon.utils.SpringUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2021-03-25
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@ComponentScan(value="com.example.cyjcommon")
public class CyjUserApplication {

        public static void main(String[] args) {
                SpringApplication springApplication = new SpringApplication(CyjUserApplication.class);
                ConfigurableApplicationContext configurableApplicationContext = springApplication.run(args);
                // 将Context设置到SpringUtil中
                SpringUtil.setApplicationContext(configurableApplicationContext);
        }


}
