package com.example.Library_Management_System.controller;

import com.example.Library_Management_System.entity.Author;
import com.example.Library_Management_System.entity.Student;
import com.example.Library_Management_System.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/author")
public class AuthorController {
    @Autowired
    AuthorService authorService;
    @PostMapping("/add")
    public String addAuthor(@RequestBody Author author){
        return authorService.addAuthor(author);

        //delete author by id
        //update the author by id
        //find the author by id
        //find all student
        @DeleteMapping("/deleteAuthor")
        public String deleteAuthor(@RequestParam int id){
             return authorService.deleteAuthor(id);
        }

        @PutMapping("/updateAuthor")
        public String updateAuthor(@RequestParam int id){
            return authorService.updateAuthor(id);
        }
        @GetMapping("/findAuthorById")
        public Student findAuthorByIdd(@RequestParam int id){
            return authorService.findAuthorById(id);
        }

        @GetMapping("/findAllAuthor")
        public List<Author> findAllAuthor(){
            return authorService.findAllAuthor();
        }


    }
}
