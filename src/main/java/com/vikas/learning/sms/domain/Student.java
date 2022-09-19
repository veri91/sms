package com.vikas.learning.sms.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

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

    @Column(name = "STUDENT_NATIONALITY")
    private String studentNationality;

    @Column(name = "STUDENT_FAVOURITE_SUBJECT")
    private String studentFavouriteSubject;

    @OneToOne()
    @JoinColumn(name = "ADDRESS_ID", referencedColumnName = "ADDRESS_ID")
    private Address address;


}
