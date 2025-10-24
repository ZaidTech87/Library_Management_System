package com.example.Library_Management_System.repository;

import com.example.Library_Management_System.entity.Book;
import com.example.Library_Management_System.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

    // ✅ Option 1 (if you have Author object)
    // List<Book> findByAuthor(Author author);
    // int countByAuthor(Author author);

    // ✅ Option 2 (if you only have author ID)
    List<Book> findByAuthor_Id(int authorId);
    int countByAuthor_Id(int authorId);
}
