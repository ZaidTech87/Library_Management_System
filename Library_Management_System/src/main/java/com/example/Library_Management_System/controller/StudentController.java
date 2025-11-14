package com.example.Library_Management_System.controller;

import com.example.Library_Management_System.dto.RequestDTO.StudentRequestDTO;
import com.example.Library_Management_System.dto.RequestDTO.UpdateStudentMob_noRequestDTO;
import com.example.Library_Management_System.dto.ResponseDTO.UpdateStudentMob_noResponceDTO;
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
    @PutMapping("/update_Mobile")
    public UpdateStudentMob_noResponceDTO updateStudentMobile(@RequestBody UpdateStudentMob_noRequestDTO updateStudentMob_noRequestDTO) {
        return studentService.updateStudentMobile(updateStudentMob_noRequestDTO);

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
