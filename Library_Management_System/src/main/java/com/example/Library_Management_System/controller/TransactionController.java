package com.example.Library_Management_System.controller;

import com.example.Library_Management_System.dto.RequestDTO.IssueBookRequestDTO;
import com.example.Library_Management_System.dto.ResponceDTO.IssueBookResponseDTO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transaction")
public class TransactionController {
    public IssueBookResponseDTO issueBook(IssueBookRequestDTO issueBookRequestDTO) {
        IssueBookResponseDTO issueBookResponseDTO = new IssueBookResponseDTO();
    }

}
