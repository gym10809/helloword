package com.gym.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gym
 * @create 2022/6/23 0023 10:41
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello,spring-boot";
    }


    @RequestMapping("/github")
    public String github(){
        return "Account to github+111111+22222+33333";
    }
}
