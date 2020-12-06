package com.hongtian;

import com.hongtian.entity.MyClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author weed
 * @date 2020/12/1 0001 11:58
 * @description
 */
@Configuration
public class MyAutoConfiguration {

    @Bean
    public MyClass getMyClass(){
        return new MyClass();
    }
}
