package com.hongtian.demo.dao;

import com.hongtian.demo.annotation.Select;

/**
 * @author weed
 * @date 2020/12/2 0002 9:32
 * @description
 */
public interface SelectDao {

    @Select("select * from system")
    void list();
}