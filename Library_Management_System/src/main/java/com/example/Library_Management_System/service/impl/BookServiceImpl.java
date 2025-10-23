package com.example.Library_Management_System.service.impl;

import com.example.Library_Management_System.entity.Author;
import com.example.Library_Management_System.entity.Book;
import com.example.Library_Management_System.repository.AuthorRepository;
import com.example.Library_Management_System.repository.BookRepository;
import com.example.Library_Management_System.service.AuthorService;
import com.example.Library_Management_System.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    BookRepository bookRepository;
    AuthorRepository authorRepository;

    public String addBook(Book book) throws Exception {
        Author author;
        try {
            author = authorRepository.findById((long) book.getAuthor().getId()).get();
        } catch (Exception e) {
            throw new Exception("author is not present");
        }
        author.getBooks().add(book);
        book.setAuthor(author);
        authorRepository.save(author);
        return "Book added successfully";
    }

    public List<Book> findAllBook() {
        List<Book> books = new ArrayList<>();
        bookRepository.findAll().forEach(books::add);
        return books;
    }

    public List<Book> findAllBookParticularAuthorId(@RequestParam int id) {
        return bookRepository.findByAuthor(id);
    }

    public int findNoofBookByAuthor(@RequestParam int id){
       return  bookRepository.countByAuthor(id);

    }

}