package com.vikas.learning.sms.service;

import com.vikas.learning.sms.controller.request.AddStudentRequest;
import com.vikas.learning.sms.domain.Student;

import java.util.List;

public interface StudentService {
    Student addStudent(AddStudentRequest addStudentRequest);

    List<Student> getStudent();
}
