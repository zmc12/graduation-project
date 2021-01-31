package com.jsut.web.service;

import com.jsut.web.pojo.Book;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import java.util.List;

/**
 * @author ZhangMinCong
 * @date 2021/1/26 9:45
 */
@EnableAutoConfiguration

public interface BookService {
    List<Book> selectAll();

    void delete(String bookName);

    void insert(Book book);

    void update(Book book);

    List<Book> selectByName(String bookName);


    void updateTime(String bookName, String studentName, String time);
}
