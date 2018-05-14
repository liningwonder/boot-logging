package com.lining.boot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * description:
 * date 2018-05-14
 *
 * @author lining1
 * @version 1.0.0
 */
@SpringBootApplication
@MapperScan("com.lining.boot.mapper")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
