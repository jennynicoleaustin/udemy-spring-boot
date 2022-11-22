package com.ltp.gradesubmission.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter // generates all the getters
@Setter // generates all the setters
@AllArgsConstructor // creates a constructor with all fields
@NoArgsConstructor // creates a constructor with no fields
public class Course {

    private Long id;
    private String subject;
    private String code;
    private String description;



}
