package com.michloas.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by michloas on 2018/8/8.
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello(){
        return "hello spring boot 2.0.4  1233444111";
    }

}
