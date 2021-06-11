package com.fung.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 主程序類
 * @SpringBootApplicatio:這是一個SpringBoot應用
 */
@SpringBootApplication
public class MainApplication {


    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);

//        //1. 返回我們的IOC容器
//        ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class, args);
//
//        //2.查看容器裏面的組件
//        String[] names = run.getBeanDefinitionNames();
//        for (String name : names) {
//            System.out.println(name);
//        }
    }

}
