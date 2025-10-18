package com.example.Library_Management_System.entity;

import com.example.Library_Management_System.enums.CardStatus;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

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
    @Enumerated(EnumType.STRING)
    private CardStatus cardStatus;
    private Date validTill;

    @OneToOne
    @JoinColumn
    private Student student;
}
