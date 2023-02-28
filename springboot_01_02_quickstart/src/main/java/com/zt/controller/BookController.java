package com.zt.controller;

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

    @GetMapping
    public String getById(){
        System.out.println("spring boot is running...2");
        return "spring boot is running...2";
    }

}
