package com.example.Library_Management_System.service.impl;

import com.example.Library_Management_System.entity.Card;
import com.example.Library_Management_System.entity.Student;
import com.example.Library_Management_System.enums.CardStatus;
import com.example.Library_Management_System.repository.StudentRepository;
import com.example.Library_Management_System.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Date;

@Service
public class StudentServiceImpl  implements StudentService {
    @Autowired
     StudentRepository studentRepository;
    public String addStudent( Student student){
        Card card = new Card();

        card.setCardStatus(CardStatus.ACTIVATED);
        card.setValidTill(new Date("2025-12-01"));
        card.setStudent(student);
        student.setCard(card);
    }
}
