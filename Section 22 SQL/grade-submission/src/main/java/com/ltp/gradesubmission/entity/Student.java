package com.ltp.gradesubmission.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Table(name = "student")
@Getter // generates all the getters
@Setter // generates all the setters
@AllArgsConstructor // creates a constructor with all fields
@NoArgsConstructor // creates a constructor with no fields
public class Student {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name="name", nullable = false)
    private String name;

    @Column(name="birth_date", nullable = false)
    private LocalDate birthDate;


}
