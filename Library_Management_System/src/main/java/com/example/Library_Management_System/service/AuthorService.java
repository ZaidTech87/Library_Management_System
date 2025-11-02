package com.example.Library_Management_System.service;

import com.example.Library_Management_System.entity.Author;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface AuthorService {


public String addAuthor(Author author);
    public String deleteAuthor( int id);
    public String updateAuthor( int id, String name);
    public Author findAuthorById( int id);
    public List<Author> findAllAuthor();
    public Author getByEmail(String email);

}
