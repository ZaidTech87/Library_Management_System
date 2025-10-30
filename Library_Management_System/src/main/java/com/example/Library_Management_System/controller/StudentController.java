package com.example.Library_Management_System.controller;

import com.example.Library_Management_System.dto.requestDTO.StudentRequestDTO;
import com.example.Library_Management_System.entity.Student;
import com.example.Library_Management_System.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    // ✅ Add a new student
    @PostMapping("/add")
    public String addStudent(@RequestBody StudentRequestDTO studentRequestDTO) {
        return studentService.addStudent(studentRequestDTO);
    }

    // ✅ Delete a student by ID
    @DeleteMapping("/delete")
    public String deleteStudent(@RequestParam int id) {
        return studentService.deleteStudent(id);
    }

    // ✅ Update a student’s name by ID
    @PutMapping("/update")
    public String updateStudent(@RequestParam int id, @RequestParam String name) {
        return studentService.updateStudent(id, name);
    }

    // ✅ Find a student by ID
    @GetMapping("/findById")
    public Student findStudentById(@RequestParam int id) {
        return studentService.findStudentById(id);
    }

    // ✅ Get all students
    @GetMapping("/all")
    public List<Student> findAllStudents() {
        return studentService.findAllStudents();
    }
}
