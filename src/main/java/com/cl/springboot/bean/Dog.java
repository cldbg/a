package com.cl.springboot.bean;

/**
 * @author cheng
 * @create 2020-05-22 14:55
 */
public class Dog {
    private String name;
    private Integer age;
    private int aaa;
    private String bbb;

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
