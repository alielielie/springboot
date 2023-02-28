package com.zt.mapper;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zt.domain.Book;
import com.zt.mapper.BookMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @BelongsProject: springboot
 * @BelongsPackage: com.zt
 * @Author: zt
 * @CreateTime: 2023-02-21  10:50
 * @Description:
 */

@SpringBootTest
public class BookMapperTestCase {

    @Autowired
    private BookMapper bookMapper;

    @Test
    void testGetById(){
        System.out.println(bookMapper.selectById(1));
    }

    @Test
    void testSave(){
        Book book = new Book();
        book.setType("测试数据123");
        book.setName("测试数据123");
        book.setDescription("测试数据123");
        bookMapper.insert(book);
    }

    @Test
    void testUpdate(){
        Book book = new Book();
        book.setId(19);
        book.setType("测试数据123...");
        book.setName("测试数据123...");
        book.setDescription("测试数据123...");
        bookMapper.updateById(book);
    }

    @Test
    void testDelete(){
        bookMapper.deleteById(19);
    }

    @Test
    void testGetAll(){
        List<Book> list = bookMapper.selectList(null);
        list.forEach(System.out::println);
    }

    @Test
    void testGetPage(){
        IPage<Book> page = new Page<>(2,5);
        bookMapper.selectPage(page, null);
        System.out.println(page.getCurrent());
        System.out.println(page.getSize());
        System.out.println(page.getTotal());
        System.out.println(page.getPages());
        System.out.println(page.getRecords());
    }

    @Test
    void testGetBy(){
        QueryWrapper<Book> queryWrapper = new QueryWrapper<>();
        queryWrapper.like("name","java");
        bookMapper.selectList(queryWrapper);
    }

    @Test
    void testGetBy2(){
        String name = "1";
        LambdaQueryWrapper<Book> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.like((name != null),Book::getName,name);
        bookMapper.selectList(lambdaQueryWrapper);
    }

}