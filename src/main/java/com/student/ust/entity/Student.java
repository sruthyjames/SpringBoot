package com.student.ust.entity;

import com.student.ust.repository.StudentRepository;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Data
@Table(name="student_ust_identitymappedbytest")
public class Student {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int studentId;

    private String name;
    private int age;

    private LocalDateTime CreateDate,ModifyDate;






    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "student")
    //@JoinColumn(name="book_id")
    private Set<Books> booksSet;

}
