package com.example.Library_Management_System.controller;

import com.example.Library_Management_System.entity.Student;
import com.example.Library_Management_System.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@ResponseBody
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentService studentService;
    @GetMapping("/addStudent")
    public String addStudent(@RequestBody Student student){
        return  studentService.addStudent(student);
    }

}

