package com.phoenix.yiqikang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import tk.mybatis.spring.annotation.MapperScan;


@SpringBootApplication
@MapperScan("com.phoenix.yiqikang.mapper")
@ComponentScan(basePackages = {"com.phoenix"})
@EnableCaching
@EnableScheduling
public class YiQiKangApplication {

    public static void main(String[] args) {
        SpringApplication.run(YiQiKangApplication.class, args);
    }

}
