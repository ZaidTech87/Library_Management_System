package com.example.Library_Management_System.service;

import com.example.Library_Management_System.entity.Author;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface AuthorService {


public String addAuthor(Author author);
    public String deleteAuthor(@RequestParam int id);
    public String updateAuthor(@RequestParam int id,@RequestParam String name);
    public Author findAuthorById(@RequestParam int id);
    public List<Author> findAllAuthor();

}
