package com.hongtian.demo.annotation;

import com.hongtian.demo.importDemo.MyImportBeanDefinitionRegistrar;
import com.hongtian.demo.postProcessor.MyBeanPostProcessor;
import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author weed
 * @date 2020/12/3 0003 10:03
 * @description
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Import({MyImportBeanDefinitionRegistrar.class,MyBeanPostProcessor.class})
public @interface MyImport {
}
