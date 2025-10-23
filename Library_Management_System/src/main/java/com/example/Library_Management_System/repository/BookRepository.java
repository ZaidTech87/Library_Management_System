package com.example.Library_Management_System.repository;

import com.example.Library_Management_System.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book,Integer> {
List<Book> findByAuthor(int id);
int countByAuthor(int id);
}
