package com.example.cyjworkflow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2020/1/21 14:46
 */
@SpringBootApplication
@ComponentScan(value="com.example.cyjcommon")
public class CyjWorkflowApplication {

        public static void main(String[] args) {
                SpringApplication.run(CyjWorkflowApplication.class, args);
        }

}
