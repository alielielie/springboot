package com.zt.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zt.domain.Book;
import com.zt.mapper.BookMapper;
import com.zt.service.IBookService;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @BelongsProject: springboot
 * @BelongsPackage: com.zt.service.impl
 * @Author: zt
 * @CreateTime: 2023-02-22  19:39
 * @Description:
 */

@Service
public class BookServiceImpl extends ServiceImpl<BookMapper, Book> implements IBookService {

    @Autowired
    private BookMapper bookMapper;

    @Override
    public IPage<Book> getPage(int currentPage, int pageSize) {
        IPage<Book> page = new Page<>(currentPage,pageSize);
        return bookMapper.selectPage(page,null);
    }

    @Override
    public IPage<Book> getPage(int currentPage, int pageSize, Book book) {
        LambdaQueryWrapper<Book> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.like(Strings.isNotEmpty(book.getType()),Book::getType,book.getType())
                .like(Strings.isNotEmpty(book.getDescription()),Book::getDescription,book.getDescription())
                .like(Strings.isNotEmpty(book.getName()),Book::getName,book.getName());
        IPage<Book> page = new Page<>(currentPage,pageSize);
        return bookMapper.selectPage(page,lambdaQueryWrapper);
    }
}
