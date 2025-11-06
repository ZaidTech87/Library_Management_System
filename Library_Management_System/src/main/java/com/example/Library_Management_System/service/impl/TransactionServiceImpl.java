package com.example.Library_Management_System.service.impl;

import com.example.Library_Management_System.dto.RequestDTO.IssueBookRequestDTO;
import com.example.Library_Management_System.dto.ResponceDTO.IssueBookResponseDTO;
import com.example.Library_Management_System.entity.Book;
import com.example.Library_Management_System.entity.Card;
import com.example.Library_Management_System.entity.Transaction;
import com.example.Library_Management_System.enums.TransactionStatus;
import com.example.Library_Management_System.repository.BookRepository;
import com.example.Library_Management_System.repository.CardRepository;
import com.example.Library_Management_System.repository.TransactionRepository;
import com.example.Library_Management_System.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.pulsar.PulsarProperties;
import org.springframework.stereotype.Service;

import static javax.print.attribute.standard.MediaSizeName.C;

@Service
public  class TransactionServiceImpl implements TransactionService {
    @Autowired
    CardRepository cardRepository;
    @Autowired
    BookRepository bookRepository;
    @Autowired
    TransactionRepository transactionRepository;

    @Override
    public IssueBookResponseDTO issuBook(IssueBookRequestDTO issueBookRequestDTO){
        Transaction transaction = new Transaction();
        transaction.setIssueOperation(true);
        Card card;
        try{
            card = cardRepository.findById(issueBookRequestDTO.getCardId()).get();
        }catch (Exception e){
            transaction.setTransactionStatus(TransactionStatus.FAILED);
            transactionRepository.save(transaction);
            throw new Exception("invalid card id");
        }
        transaction.setCard(card);
        Book book;
        try {
            book = bookRepository.findById(issueBookRequestDTO.getBookId()).get();
        }catch (Exception e){
            transaction .setTransactionStatus(TransactionStatus.FAILED);
            transactionRepository.save(transaction);
            throw new Exception("invalid book id ");

        }
        transaction.setBook(book);




    }
}
