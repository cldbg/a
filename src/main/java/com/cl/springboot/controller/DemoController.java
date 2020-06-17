package com.cl.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author cheng
 * @create 2020-06-02 22:21
 */
@Controller
public class DemoController {

    @RequestMapping("/,/index.html")
    public String index(){
        return "index";
    }
}
