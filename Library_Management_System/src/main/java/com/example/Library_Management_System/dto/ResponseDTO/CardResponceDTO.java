package com.example.Library_Management_System.dto.ResponseDTO;

import com.example.Library_Management_System.enums.Department;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CardResponceDTO {
    private int id;
    private String name;
    private int age;
    private Department department;
    private String mob_no;
    CardResponceDTO cardResponceDTO;
  //  1.40 mnt se padhna hai
}
