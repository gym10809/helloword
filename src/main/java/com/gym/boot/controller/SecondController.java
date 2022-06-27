package com.gym.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gym
 * @create 2022/6/27 0027 19:42
 */
@RestController
public class SecondController {
    @RequestMapping("/second")
    public String second(){
        return "second+11111";
    }
}
