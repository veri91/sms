package com.vikas.learning.sms.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "STUDENT")
@Entity
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class Student {

    @Id
    @Column(name = "STUDENT_ID")
    private String studentId;

    @Column(name = "STUDENT_NAME")
    private String studentName;

    @Column(name = "STUDENT_COUNTRY")
    private String studentCountry;

    @Column(name = "STUDENT_NATIONALITY")
    private String studentNationality;


}
