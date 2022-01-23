package com.phoenix.yiqikang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.phoenix.yiqikang.mapper")
@ComponentScan(basePackages = {"com.phoenix"})
public class YiQiKangApplication {

    public static void main(String[] args) {
        SpringApplication.run(YiQiKangApplication.class, args);
    }

}
