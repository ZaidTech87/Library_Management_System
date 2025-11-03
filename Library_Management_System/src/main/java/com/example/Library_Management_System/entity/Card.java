package com.example.Library_Management_System.entity;

import com.example.Library_Management_System.enums.CardStatus;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="card")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @CreationTimestamp
   private Date date;
    @UpdateTimestamp
    private Date updadetOn;

    @Enumerated(EnumType.STRING)
    private CardStatus cardStatus;
    private String validTill;

    @OneToOne
    @JoinColumn
    @JsonIgnore
    private Student student;

    @OneToMany(mappedBy = "card" , cascade = CascadeType.ALL)
    List<Book> bookIssue = new ArrayList<>();

    @OneToMany(mappedBy = "card" , cascade = CascadeType.ALL)
    List<Transaction> transactionList = new ArrayList<>();


}
