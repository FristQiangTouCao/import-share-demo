package com.hongtian.demo.importDemo;

import com.hongtian.demo.dao.SelectDao;
import com.hongtian.demo.factory.DaoFactoryBean;
import com.hongtian.demo.instance.Aaaaaa3;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.context.annotation.Scope;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author weed
 * @date 2020/12/1 0001 9:56
 * @description
 */
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

    public void registerBeanDefinitions(AnnotationMetadata annotationMetadata, BeanDefinitionRegistry registry) {
        BeanDefinitionBuilder beanDefinitionBuilder = BeanDefinitionBuilder.genericBeanDefinition(Aaaaaa3.class);
        GenericBeanDefinition beanDefinition = (GenericBeanDefinition)beanDefinitionBuilder.getBeanDefinition();
        beanDefinition.getConstructorArgumentValues().addGenericArgumentValue("构造方法初始化赋值。。。。");
        beanDefinition.getPropertyValues().addPropertyValue("test","测试");
        registry.registerBeanDefinition(Aaaaaa3.class.getSimpleName(),beanDefinition);
    }
//    public void registerBeanDefinitions(AnnotationMetadata annotationMetadata, BeanDefinitionRegistry registry) {
//        BeanDefinitionBuilder beanDefinitionBuilder = BeanDefinitionBuilder.genericBeanDefinition(DaoFactoryBean.class);
//        GenericBeanDefinition beanDefinition = (GenericBeanDefinition)beanDefinitionBuilder.getBeanDefinition();
//        beanDefinition.getConstructorArgumentValues().addGenericArgumentValue(SelectDao.class);
//        registry.registerBeanDefinition(SelectDao.class.getSimpleName(),beanDefinition);
//    }
}
