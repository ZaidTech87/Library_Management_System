package com.example.Library_Management_System.service.impl;

import com.example.Library_Management_System.entity.Card;
import com.example.Library_Management_System.entity.Student;
import com.example.Library_Management_System.enums.CardStatus;
import com.example.Library_Management_System.repository.StudentRepository;
import com.example.Library_Management_System.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public String addStudent(Student student) {
        Card card = new Card();
        card.setCardStatus(CardStatus.ACTIVATED);
        card.setValidTill("2025-12-01");
        card.setStudent(student);

        student.setCard(card);
        studentRepository.save(student);
        return "Student added successfully!";
    }

    @Override
    public String deleteStudent(int id) {
        studentRepository.deleteById(id);
        return "Student deleted successfully!";
    }

    @Override
    public String updateStudent(int id, String name) {
        Optional<Student> optionalStudent = studentRepository.findById(id);
        if (optionalStudent.isPresent()) {
            Student student = optionalStudent.get();
            student.setName(name);
            studentRepository.save(student);
            return "Student updated successfully!";
        } else {
            return "Student not found!";
        }
    }

    @Override
    public Student findStudentById(int id) {
        return studentRepository.findById(id).orElse(null);
    }

    @Override
    public List<Student> findAllStudents() {
        List<Student> students = new ArrayList<>();
        studentRepository.findAll().forEach(students::add);
        return students;
    }
}
