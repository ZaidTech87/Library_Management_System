package com.example.Library_Management_System.service;

import com.example.Library_Management_System.dto.RequestDTO.IssueBookRequestDTO;
import com.example.Library_Management_System.dto.ResponceDTO.IssueBookResponseDTO;

public interface TransactionService {

    public IssueBookResponseDTO issueBook(IssueBookRequestDTO issueBookRequestDTO);
}
