package com.student.ust.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Data
@Table(name="book_ust_identitymappedbytest")
public class Books {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int bookId;
    private String name;
    private int year;
    private int price;
    private LocalDateTime CreateDate;
    private LocalDateTime ModifyDate;


    @ManyToOne
    //@JoinColumn(name="student_id")
    private Student student;

}