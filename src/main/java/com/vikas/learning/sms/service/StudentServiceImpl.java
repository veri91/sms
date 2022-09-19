package com.vikas.learning.sms.service;

import com.vikas.learning.sms.controller.request.AddStudentRequest;
import com.vikas.learning.sms.dao.AddressRepository;
import com.vikas.learning.sms.dao.StudentRepository;
import com.vikas.learning.sms.domain.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    private final AddressRepository addressRepository;

    @Override
    public Student addStudent(AddStudentRequest addStudentRequest) {
        return studentRepository.save(getStudent(addStudentRequest));
    }

    @Override
    public List<Student> getStudent() {
        return studentRepository.findAll();
    }

    @Override
    public Student removeStudent(String name) {
        Student student = studentRepository.findStudentByStudentName(name);
        studentRepository.delete(student);
        return student;
    }

    @Override
    public Student getStudentDetailsByName(String name) {
        return studentRepository.findStudentByStudentName(name);
    }

    private Student getStudent(AddStudentRequest addStudentRequest) {
        return new Student(UUID.randomUUID().toString(),
                addStudentRequest.getName(),
                addStudentRequest.getNationality(),
                addStudentRequest.getFavouriteSubject(),
                addressRepository.findById(addStudentRequest.getAddressId())
                        .orElse(null));
    }

}

