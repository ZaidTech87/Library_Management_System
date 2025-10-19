package com.example.Library_Management_System.service.impl;

import com.example.Library_Management_System.entity.Author;
import com.example.Library_Management_System.entity.Book;
import com.example.Library_Management_System.repository.AuthorRepository;
import com.example.Library_Management_System.repository.BookRepository;
import com.example.Library_Management_System.service.AuthorService;
import com.example.Library_Management_System.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
//     BookRepository bookRepository;
    AuthorRepository authorRepository;
    public String addBook(Book book) throws Exception {
       Author author;
       try{
           author = authorRepository.findById((long) book.getAuthor().getId()).get();
       }
       catch(Exception e){
           throw new Exception("author is not present");
       }
       author.getBooks().add(book);
       book.setAuthor(author);
       authorRepository.save(author);
       return "Book added successfully";

    }
}
