package com.example.Library_Management_System.dto.requestDTO;

import com.example.Library_Management_System.enums.Department;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class StudentRequestDTO {
    private String name;
    private int age;
    private Department department;
    private String mob_no;

}
