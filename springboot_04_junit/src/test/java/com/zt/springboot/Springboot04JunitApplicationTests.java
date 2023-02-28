package com.zt.springboot;

import com.zt.springboot.dao.BookDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sound.midi.Soundbank;

@SpringBootTest
class Springboot04JunitApplicationTests {

    //1.注入你要测试的对象
    @Autowired
    private BookDao bookDao;

    @Test
    void contextLoads() {
        //2.执行你要测试的对象的方法
        bookDao.save();
    }

}
