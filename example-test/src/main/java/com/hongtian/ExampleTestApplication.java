package com.hongtian;

import com.hontian.annotation.EnableHongTianApi;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

/**
 * @author weed
 * @date 2020/12/1 0001 11:14
 * @description
 */
@SpringBootApplication
@Configuration
@EnableHongTianApi
public class ExampleTestApplication {
    public static void main(String[] args) {
        SpringApplication.run(ExampleTestApplication.class);
    }
}