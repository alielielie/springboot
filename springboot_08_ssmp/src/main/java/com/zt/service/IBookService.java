package com.zt.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zt.domain.Book;

/**
 * @BelongsProject: springboot
 * @BelongsPackage: com.zt.service
 * @Author: zt
 * @CreateTime: 2023-02-22  19:36
 * @Description:
 */

public interface IBookService extends IService<Book> {

    IPage<Book> getPage(int currentPage,int pageSize);

    IPage<Book> getPage(int currentPage,int pageSize,Book book);

}
