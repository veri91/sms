package com.vikas.learning.sms.service;

import com.vikas.learning.sms.controller.request.AddStudentRequest;
import com.vikas.learning.sms.dao.StudentRepository;
import com.vikas.learning.sms.domain.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    @Override
    public Student addStudent(AddStudentRequest addStudentRequest) {
        return studentRepository.save(getStudent(addStudentRequest));
    }

    @Override
    public List<Student> getStudent() {
        return studentRepository.findAll();
    }

    private Student getStudent(AddStudentRequest addStudentRequest) {
        return new Student(UUID.randomUUID().toString(),
                addStudentRequest.getName());
    }
}
