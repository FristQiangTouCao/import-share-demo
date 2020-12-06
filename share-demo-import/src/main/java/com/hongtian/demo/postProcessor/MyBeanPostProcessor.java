package com.hongtian.demo.postProcessor;

import com.hongtian.demo.instance.Aaaaaa3;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author weed
 * @date 2020/12/1 0001 10:18
 * @description
 */
public class MyBeanPostProcessor implements BeanPostProcessor {
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if(beanName.equals("Aaaaaa3")){
            Aaaaaa3 aaaaaa3 = (Aaaaaa3)bean;
            aaaaaa3.setTest("后置处理器修改");
        }
        return bean;
    }
}