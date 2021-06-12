package com.fung.boot.config;

import com.fung.boot.bean.Car;
import com.fung.boot.bean.Pet;
import com.fung.boot.bean.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * 1. 配置類裏面使用@Bean注解給容器注冊組件，默認是單實例
 * 2. 配置類本身也是組件
 * 3. proxyBeanMethods:代理Bean的方法，默認true
 * 4. @Import 給容器中自動創建組件(默認名字就是全類名)
 * 5. @ImportResource("classpath:beans.xml") :可以導入beans配置文件照樣使用配置文件和注解方式
 * 6. @EnableConfigurationProperties(Car.class) ：
 *      1.開啓Car配置綁定功能
 *      2.把這個Car組件自動注冊到容器中
 */
@Import({User.class,Pet.class})
@Configuration(proxyBeanMethods = true)
@ConditionalOnMissingBean(name = "xx") //條件裝配
@EnableConfigurationProperties(Car.class)
public class MyConfig {

    @Bean("user")
    public User user01(){
        User user = new User("hey", 11, pet01());
        return user;
    }

    @Bean("pet")
    public Pet pet01(){
        Pet pet = new Pet("test", 12.1);
        return pet;
    }
}
