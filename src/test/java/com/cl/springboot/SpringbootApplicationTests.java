package com.cl.springboot;

import com.cl.springboot.bean.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class SpringbootApplicationTests {

    @Autowired
    Person person;

    @Autowired
    ApplicationContext app;

    @Test
    void contextLoads() {
        boolean b = this.app.containsBean("app");
        System.out.println(b);
    }

}
