package com.example.Library_Management_System.service.impl;

import com.example.Library_Management_System.dto.ResponseDTO.UpdateStudentMob_noResponceDTO;
import com.example.Library_Management_System.dto.RequestDTO.UpdateStudentMob_noRequestDTO;
import com.example.Library_Management_System.dto.RequestDTO.StudentRequestDTO;
import com.example.Library_Management_System.entity.Card;
import com.example.Library_Management_System.entity.Student;
import com.example.Library_Management_System.enums.CardStatus;
import com.example.Library_Management_System.exeptions.StudentNotFoundExeption;
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
    public String addStudent(StudentRequestDTO studentRequestDTO) {
        Student student = new Student();
        student.setName(studentRequestDTO.getName());
        student.setAge(studentRequestDTO.getAge());
        student.setDepartment(studentRequestDTO.getDepartment());
        student.setMob_no(studentRequestDTO.getMob_no());

        Card card = new Card();
        card.setCardStatus(CardStatus.ACTIVATED);
        card.setValidTill("12/11/2025");
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
    public UpdateStudentMob_noResponceDTO updateStudentMobile(UpdateStudentMob_noRequestDTO updateStudentMob_noRequestDTO) {
        try{

           Student student = studentRepository.findById(updateStudentMob_noRequestDTO.getId()).get();
           student.setMob_no(updateStudentMob_noRequestDTO.getMob_no());
           Student updatedStudent = studentRepository.save(student);

            UpdateStudentMob_noResponceDTO updateStudentMob_noResponceDTO2 = new UpdateStudentMob_noResponceDTO();
           updateStudentMob_noResponceDTO2.setName(updatedStudent.getName());
           updateStudentMob_noResponceDTO2.setMob_no(updatedStudent.getMob_no());
           return updateStudentMob_noResponceDTO2;
        }
        catch (Exception e){
            throw new StudentNotFoundExeption("Student id not found!");
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
        //lecture 4 ,48.38 mujhe dtart karna hai

    }
}
