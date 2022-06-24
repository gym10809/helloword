package com.gym.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 主程序类
 * @author gym
 * @create 2022/6/23 0023 10:38
 */
//主程序类的标识
@SpringBootApplication
//开启配置文件导入
@EnableConfigurationProperties
public class MainApplication {

    public static void main(String[] args) {
        //获取ioc容器
        ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class, args);
        //获取容器中bean对象的名字
//        String[] beanDefinitionNames = run.getBeanDefinitionNames();
//        for (String beanDefinitionName : beanDefinitionNames) {
//            System.out.println(beanDefinitionName);
//        }
    }
}
