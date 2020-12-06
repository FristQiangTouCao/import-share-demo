package com.hongtian.demo;

import com.hongtian.demo.annotation.MyImport;
import com.hongtian.demo.dao.SelectDao;
import com.hongtian.demo.importDemo.MyImportSelect;
import com.hongtian.demo.instance.Aaaaaa3;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author weed
 * @date 2020/12/1 0001 9:49
 * @description
 */
@Configuration
@MyImport
public class ImportApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ImportApplication.class);
        Aaaaaa3 bean = context.getBean(Aaaaaa3.class);
        bean.print();
//        SelectDao bean = context.getBean(SelectDao.class);
//        bean.list();
    }
}