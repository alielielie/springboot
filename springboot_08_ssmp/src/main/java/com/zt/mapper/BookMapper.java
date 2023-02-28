package com.zt.mapper;

import com.zt.domain.Book;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
* @author ztyt
* @description 针对表【tbl_book】的数据库操作Mapper
* @createDate 2023-02-21 10:27:06
* @Entity com.zt.domain.TblBook
*/

@Mapper
public interface BookMapper extends BaseMapper<Book> {

}




