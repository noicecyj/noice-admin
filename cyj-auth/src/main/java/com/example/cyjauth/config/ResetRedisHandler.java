package com.example.cyjauth.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
public class ResetRedisHandler implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(ResetRedisHandler.class);


    private StringRedisTemplate redisTemplate;

    @Autowired
    public void setRedisTemplate(StringRedisTemplate redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("删除所有redis");
        Set<String> keys = redisTemplate.keys("*");
        redisTemplate.delete(keys);
    }
}
