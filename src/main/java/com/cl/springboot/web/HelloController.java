package com.cl.springboot.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cheng
 * @create 2020-05-12 23:31
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "我是你大爷";
    }
}
