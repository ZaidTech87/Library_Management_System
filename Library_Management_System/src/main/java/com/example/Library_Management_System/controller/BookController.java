package com.example.Library_Management_System.controller;

import com.example.Library_Management_System.entity.Book;
import com.example.Library_Management_System.entity.Student;
import com.example.Library_Management_System.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    BookService bookService;

    @PostMapping("/add")
    public String addBook(@RequestBody Book book) throws Exception {
        return bookService.addBook(book);
    }
        //find all the book;
        //find all book a particular authorid
        //find the number of book writteb by ann author

    @GetMapping("/findallBook")
        public List<Book> findAllBook(){
        return bookService.findAllBook();
        }
        @GetMapping("/findAllByAuthorId")
        public List<Book> findAllBookParticularAuthorId(@RequestParam int id){
        return bookService.findAllBookParticularAuthorId(id);
        }
        @GetMapping("/findNoBook")
        public int findNoofBookByAuthor(@RequestParam int id){
        return bookService.findNoofBookByAuthor(id);
        }


}
