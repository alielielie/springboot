package com.zt.controller;

import com.zt.MyDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @BelongsProject: springboot
 * @BelongsPackage: com.zt.controller
 * @Author: zt
 * @CreateTime: 2023-02-10  17:39
 * @Description:
 */



//REST模式
@RestController
@RequestMapping("/books")
public class BookController {

    //读取yaml数据中的单一数据
    @Value("${country}")
    private String country;

    @Value("${user1.name}")
    private String name;

    @Value("${likes[1]}")
    private String likes;

    @Value("${server.port}")
    private String port;

    @Value("${tempDir}")
    private String tempDir;

    //使用自动装配将所有的数封装到一个Environment对象中
    @Autowired
    private Environment env;

    @Autowired
    private MyDataSource myDataSource;

    @GetMapping
    public String getById(){
        System.out.println("spring boot is running...");
        System.out.println("country---->" + country);
        System.out.println("name = " + name);
        System.out.println("likes = " + likes);
        System.out.println("port = " + port);
        System.out.println("tempDir = " + tempDir);
        System.out.println("-----------------------------");
        System.out.println(env.getProperty("server.port"));
        System.out.println(env.getProperty("user1.name"));
        System.out.println("-----------------------------");
        System.out.println(myDataSource);
        return "spring boot is running...";
    }

}
