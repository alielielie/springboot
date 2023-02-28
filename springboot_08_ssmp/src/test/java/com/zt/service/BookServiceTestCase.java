package com.zt.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zt.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @BelongsProject: springboot
 * @BelongsPackage: com.zt.service
 * @Author: zt
 * @CreateTime: 2023-02-22  19:21
 * @Description:
 */

@SpringBootTest
public class BookServiceTestCase {

    @Autowired
    private IBookService bookService;

    @Test
    void testGetById(){
        Book book = bookService.getById(4);
        System.out.println(book);
    }

    @Test
    void testSave(){
        Book book = new Book();
        book.setType("测试数据123..");
        book.setName("测试数据123..");
        book.setDescription("测试数据123..");
        bookService.save(book);
    }

    @Test
    void testUpdate(){
        Book book = new Book();
        book.setId(13);
        book.setType("测试.0.0.0.0..");
        book.setName("测试数据1");
        book.setDescription("测试数.");
        bookService.updateById(book);
    }

    @Test
    void testDelete(){
        bookService.removeById(13);
    }

    @Test
    void testGetAll(){
        List<Book> list = bookService.list();
        list.forEach(System.out::println);
    }

    @Test
    void testGetPage(){
        IPage<Book> page = new Page<>(2,5);
        bookService.page(page);
        System.out.println(page.getCurrent());
        System.out.println(page.getSize());
        System.out.println(page.getTotal());
        System.out.println(page.getPages());
        System.out.println(page.getRecords());
    }

}
