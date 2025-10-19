package com.example.Library_Management_System.controller;

import com.example.Library_Management_System.entity.Student;
import com.example.Library_Management_System.service.StudentService;
import com.example.Library_Management_System.service.impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentService studentService;
    @PostMapping("/add")
    public String addStudent(@RequestBody Student student){
        return  studentService.addStudent(student);
    }
    //delete student by id
    //update the student by id
    //find the student by id
    //find all student

}

