package com.zt.domain;

import lombok.Data;

/**
 * @BelongsProject: springboot
 * @BelongsPackage: com.zt.domain
 * @Author: zt
 * @CreateTime: 2023-02-20  21:10
 * @Description:
 */

@Data
public class Book {
    private Integer id;
    private String type;
    private String name;
    private String description;
}
