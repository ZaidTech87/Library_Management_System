package com.example.Library_Management_System.entity;

import com.example.Library_Management_System.enums.Genre;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="book")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String title;
    @Enumerated(EnumType.STRING)
    private Genre genre;
    private int noOfPages;
    private int price;

}
