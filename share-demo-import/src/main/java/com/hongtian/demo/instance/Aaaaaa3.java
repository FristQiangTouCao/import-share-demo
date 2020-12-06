package com.hongtian.demo.instance;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author weed
 * @date 2020/12/1 0001 9:51
 * @description
 */
public class Aaaaaa3 {
    private String test = "默认值";

    public Aaaaaa3(String test) {
        this.test = test;
        System.out.println("Aaaaaa3初始化");
    }

    public Aaaaaa3(){
        System.out.println("Aaaaaa3初始化");
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public void print(){
        System.out.println(test);
    }
}
