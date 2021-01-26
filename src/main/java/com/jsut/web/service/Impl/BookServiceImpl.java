package com.jsut.web.service.Impl;

import com.jsut.web.mapper.BookMapper;
import com.jsut.web.pojo.Book;
import com.jsut.web.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ZhangMinCong
 * @date 2021/1/26 9:45
 */
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookMapper bookMapper;

    public List<Book> selectAll() {
        List<Book> books = bookMapper.selectAll();
        return books;
    }

    public void delete(String bookName) {
        bookMapper.delete(bookName);
        return;
    }

    public void insert(Book book) {
        bookMapper.insert(book);
    }

    public void update(Book book) {
        bookMapper.update(book);
    }

    public List<Book> selectByName(String bookName) {
        return bookMapper.selectByName(bookName);
    }

    public void updateTime(String bookName) {
        bookMapper.selectByName(bookName);
    }
}
