package com.example.Library_Management_System.dto.ResponseDTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class IssueBookResponseDTO {
    private String transactionNumber;
    private String transactionStatus;
    private String bookName;
}
