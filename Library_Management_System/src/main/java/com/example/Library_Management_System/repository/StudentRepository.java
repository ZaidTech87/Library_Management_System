package com.example.Library_Management_System.repository;

import com.example.Library_Management_System.entity.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<Student,Integer> {
}
