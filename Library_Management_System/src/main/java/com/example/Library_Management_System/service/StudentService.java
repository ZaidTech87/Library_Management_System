package com.example.Library_Management_System.service;

import com.example.Library_Management_System.dto.RequestDTO.StudentRequestDTO;
import com.example.Library_Management_System.dto.RequestDTO.UpdateStudentMob_noRequestDTO;
import com.example.Library_Management_System.dto.ResponseDTO.StudentResponseDTO;
import com.example.Library_Management_System.dto.ResponseDTO.UpdateStudentMob_noResponceDTO;
import com.example.Library_Management_System.entity.Student;
import java.util.List;

public interface StudentService {

    String addStudent(StudentRequestDTO studentRequestDTO);


    String deleteStudent(int id);
    public UpdateStudentMob_noResponceDTO updateStudentMobile(UpdateStudentMob_noRequestDTO updateStudentMob_noRequestDTO);

        String updateStudent(int id, String name);

    Student findStudentById(int id);

    List<Student> findAllStudents();
    public StudentResponseDTO getStudentById(int id);
}
