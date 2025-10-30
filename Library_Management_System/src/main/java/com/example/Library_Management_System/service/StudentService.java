package com.example.Library_Management_System.service;

import com.example.Library_Management_System.dto.requestDTO.StudentRequestDTO;
import com.example.Library_Management_System.entity.Student;
import java.util.List;

public interface StudentService {

    String addStudent(StudentRequestDTO studentRequestDTO);

    String deleteStudent(int id);

    String updateStudent(int id, String name);

    Student findStudentById(int id);

    List<Student> findAllStudents();
}
