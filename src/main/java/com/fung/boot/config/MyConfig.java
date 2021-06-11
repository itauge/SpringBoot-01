package com.fung.boot.config;

import com.fung.boot.bean.Pet;
import com.fung.boot.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 1. 配置類裏面使用@Bean注解給容器注冊組件，默認是單實例
 * 2. 配置類本身也是組件
 * 3. proxyBeanMethods:代理Bean的方法，默認true
 */
@Configuration(proxyBeanMethods = true)
public class MyConfig {

    @Bean("user")
    public User user01(){
        User user = new User("hey", 11, pet01());
        return user;
    }

    @Bean("pet")
    public Pet pet01(){
        Pet pet = new Pet("test", "pig");
        return pet;
    }
}
