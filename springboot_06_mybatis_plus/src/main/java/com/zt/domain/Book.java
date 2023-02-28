package com.zt.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @BelongsProject: springboot
 * @BelongsPackage: com.zt.domain
 * @Author: zt
 * @CreateTime: 2023-02-20  21:10
 * @Description:
 */

@Data
@TableName("tbl_book")
public class Book {
    private Integer id;
    private String type;
    private String name;
    private String description;
}
