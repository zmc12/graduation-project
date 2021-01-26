package com.jsut.web.mapper;

import com.jsut.web.pojo.Book;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author ZhangMinCong
 * @date 2021/1/26 9:45
 */
@Mapper
public interface BookMapper {

    List<Book> selectAll();

    void delete(String bookName);

    void insert(Book book);

    void update(Book book);

    List<Book> selectByName(String bookName);

    void updateTime(String bookName);
}
