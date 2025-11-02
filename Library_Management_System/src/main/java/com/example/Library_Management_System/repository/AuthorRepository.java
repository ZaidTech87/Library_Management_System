package com.example.Library_Management_System.repository;

import com.example.Library_Management_System.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuthorRepository extends JpaRepository<Author,Long> {
   static List<Author> findByEmail(String email);
}
