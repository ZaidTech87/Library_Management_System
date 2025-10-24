package com.example.Library_Management_System.service.impl;

import com.example.Library_Management_System.entity.Author;
import com.example.Library_Management_System.entity.Book;
import com.example.Library_Management_System.repository.AuthorRepository;
import com.example.Library_Management_System.repository.BookRepository;
import com.example.Library_Management_System.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private AuthorRepository authorRepository;

    @Override
    public String addBook(Book book) throws Exception {
        Author author;
        try {
            author = authorRepository.findById((long) book.getAuthor().getId())
                    .orElseThrow(() -> new Exception("Author not present"));
        } catch (Exception e) {
            throw new Exception("Author is not present");
        }

        author.getBooks().add(book);
        book.setAuthor(author);
        authorRepository.save(author);

        return "Book added successfully";
    }

    @Override
    public List<Book> findAllBook() {
        return new ArrayList<>(bookRepository.findAll());
    }

    @Override
    public List<Book> findAllBookParticularAuthorId(int id) {
        return bookRepository.findByAuthor_Id(id);
    }

    @Override
    public int findNoofBookByAuthor(int id) {
        return bookRepository.countByAuthor_Id(id);
    }
}
