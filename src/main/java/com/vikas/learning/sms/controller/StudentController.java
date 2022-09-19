package com.vikas.learning.sms.controller;

import com.vikas.learning.sms.controller.request.AddStudentRequest;
import com.vikas.learning.sms.domain.Student;
import com.vikas.learning.sms.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class StudentController {
    private final StudentService studentService;

    @PostMapping(value = "/student", consumes = "application/json",
            produces = "application/json")
    public Student addStudent(@RequestBody AddStudentRequest addStudentRequest) {
        return studentService.addStudent(addStudentRequest);
    }

    @GetMapping(value = "/student")
    public List<Student> getStudent() {
        return studentService.getStudent();
    }

    @GetMapping(value = "/student/{name}")
    public Student getStudentDetailsByName(@PathVariable String name) {
        return (Student) studentService.getStudentDetailsByName(name);
    }

    @DeleteMapping(value = "/student/{name}")
    public Student deleteStudent(@PathVariable String name) {
        return studentService.removeStudent(name);
    }

}

