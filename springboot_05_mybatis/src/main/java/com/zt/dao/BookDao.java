package com.zt.dao;

import com.zt.domain.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @BelongsProject: springboot
 * @BelongsPackage: com.zt.dao
 * @Author: zt
 * @CreateTime: 2023-02-20  21:12
 * @Description:
 */

@Mapper
public interface BookDao {
    @Select("select * from tbl_book where id = #{id}")
    Book getById(Integer id);

}
