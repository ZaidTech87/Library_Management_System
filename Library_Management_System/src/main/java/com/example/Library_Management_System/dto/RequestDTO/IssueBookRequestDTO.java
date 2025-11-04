package com.example.Library_Management_System.dto.RequestDTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class IssueBookRequestDTO {
    private int cardId;
    private int bookId;
}
