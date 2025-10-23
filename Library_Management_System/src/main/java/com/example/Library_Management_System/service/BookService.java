package com.example.Library_Management_System.service;

import com.example.Library_Management_System.entity.Book;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface BookService {

    public String addBook(Book book) throws Exception;
    public List<Book> findAllBook();
    public List<Book> findAllBookParticularAuthorId(@RequestParam int id);
    public int findNoofBookByAuthor(@RequestParam int id);
}
