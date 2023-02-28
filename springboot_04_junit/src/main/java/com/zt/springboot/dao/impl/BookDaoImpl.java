package com.zt.springboot.dao.impl;

import com.zt.springboot.dao.BookDao;
import org.springframework.stereotype.Repository;

/**
 * @BelongsProject: springboot
 * @BelongsPackage: com.zt.springboot.dao.impl
 * @Author: zt
 * @CreateTime: 2023-02-20  17:11
 * @Description:
 */

@Repository
public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("book dao is running");
    }
}
