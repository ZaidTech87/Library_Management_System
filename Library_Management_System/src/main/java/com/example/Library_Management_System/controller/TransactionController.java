package com.example.Library_Management_System.controller;

import com.example.Library_Management_System.dto.RequestDTO.IssueBookRequestDTO;
import com.example.Library_Management_System.dto.ResponseDTO.IssueBookResponseDTO;
import com.example.Library_Management_System.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transaction")
public class TransactionController {
@Autowired
TransactionService transactionService;
    @PostMapping("/add")
    public IssueBookResponseDTO issueBook(IssueBookRequestDTO issueBookRequestDTO) {
       return transactionService.issueBook(issueBookRequestDTO);
    }

}
