package com.example.Library_Management_System.service.impl;

import com.example.Library_Management_System.entity.Author;
import com.example.Library_Management_System.entity.Student;
import com.example.Library_Management_System.repository.AuthorRepository;
import com.example.Library_Management_System.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceiImpl implements AuthorService {

    @Autowired
    AuthorRepository authorRepository;

    @Override
    public String addAuthor(Author author) {
        authorRepository.save(author);
        return "Author added successfully";
    }
}
