package com.example.Library_Management_System.controller;

import com.example.Library_Management_System.entity.Book;
import com.example.Library_Management_System.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    BookService bookService;

    @PostMapping("add")
    public String addBook(@RequestBody Book book) throws Exception {
        return bookService.addBook(book);

        //find all the book;
        //find all book a particular authorid
        //find the number of book writteb by ann author


    }
}
