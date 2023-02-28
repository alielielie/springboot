package com.zt;

import com.zt.dao.BookDao;
import com.zt.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Springboot06MybatisPlusApplicationTests {

    @Autowired
    private BookDao bookDao;

    @Test
    void contextLoads() {
        System.out.println(bookDao.selectById(2));
    }

    @Test
    void testGetAll(){
        List<Book> list = bookDao.selectList(null);
        list.forEach(System.out::println);
    }

}
