package com.example.Library_Management_System.entity;

import com.example.Library_Management_System.enums.Department;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="student")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Student {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
     private   int  id;
     private String name;
     private int age;
     @Enumerated(EnumType.STRING)
      private Department department;
     private String mob_no;

     @OneToOne( mappedBy = "student", cascade = CascadeType.ALL)
      Card card;


}
