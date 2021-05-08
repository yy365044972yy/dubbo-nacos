package com.clinic;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 李文涛
 * date 2021/5/71:43 下午
 * @title: App
 */
@SpringBootApplication
@EnableDubbo
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
