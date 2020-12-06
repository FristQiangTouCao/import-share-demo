package com.hongtian.demo.importDemo;

import com.hongtian.demo.instance.Aaaaaa2;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author weed
 * @date 2020/12/1 0001 9:53
 * @description
 */
public class MyImportSelect implements ImportSelector {
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return new String[]{"com.hongtian.demo.instance.Aaaaaa2"};
    }
}
