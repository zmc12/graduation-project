package com.jsut.web.controller;

import com.jsut.web.pojo.Book;
import com.jsut.web.pojo.ResultCode;
import com.jsut.web.service.BookService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author ZhangMinCong
 * @date 2021/1/20 11:09
 */
@Controller
@Slf4j
@RequestMapping("/book")
@CrossOrigin(origins = "*",maxAge = 3600)
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping("/first")
    public String first(Model model){
        List<Book> books=bookService.selectAll();
        model.addAttribute("books",books);
        return "book";
    }

    @GetMapping("/delete")
    public String delete(Model model, @RequestParam("bookName")String bookName){
        bookService.delete(bookName);
        List<Book> books=bookService.selectAll();
        model.addAttribute("books",books);
        return "book";
    }

    @PostMapping("/insert")
    public String insert(Model model, Book book){
        bookService.insert(book);
        List<Book> books=bookService.selectAll();
        model.addAttribute("books",books);
        return "book";
    }

    @PostMapping("/update")
    public String update(Model model, Book book){
        bookService.update(book);
        List<Book> books=bookService.selectAll();
        model.addAttribute("books",books);
        return "book";
    }

    @ResponseBody
    @GetMapping("/selectBroswer")
    public List<Book>  selectBroswer(@RequestParam("bookName")String bookName){

        List<Book> books=bookService.selectByName(bookName);
        return books;
    }




}
