package com.example.Library_Management_System.dto.ResponseDTO;

import com.example.Library_Management_System.entity.Card;
import com.example.Library_Management_System.enums.Department;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class StudentResponseDTO {

    private   int  id;
    private String name;
    private int age;

    private Department department;
    private String mob_no;
    CardResponceDTO cardResponceDTO;

}
