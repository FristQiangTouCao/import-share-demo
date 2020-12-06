package com.hongtian.demo.factory;

import com.hongtian.demo.annotation.Select;
import org.springframework.beans.factory.FactoryBean;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

/**
 * @author weed
 * @date 2020/12/2 0002 9:49
 * @description
 */
public class DaoFactoryBean<T> implements FactoryBean<T>, InvocationHandler {

    private Class<T> clazz;

    private String className;

    private Map<String,String> sqlMap = new HashMap<String, String>();

    public DaoFactoryBean(Class<T> clazz){
        this.clazz = clazz;
        Method[] methods = clazz.getMethods();
        this.className = clazz.getSimpleName();
        for(Method method:methods){
            String sql = getSql(method);
            if(sql != null) {
                sqlMap.put(method.getName(),sql);
            }
        }
    }

    public String getSql(Method method){
        Select annotation = method.getAnnotation(Select.class);
        if(annotation == null) {
            return null;
        }
        return annotation.value();
    }

    public T getObject() throws Exception {
        T t = (T)Proxy.newProxyInstance(this.getClass().getClassLoader(),new Class[]{this.clazz},this);
        return t;
    }

    public Class<?> getObjectType() {
        return clazz;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if(sqlMap.containsKey(method.getName())){
            System.out.println("处理sql:" + sqlMap.get(method.getName())+". . . . .");
        }
        return null;
    }
}
