package com.vikas.learning.sms.dao;

import com.vikas.learning.sms.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, String> {

    Student findStudentByStudentName(String name);


}
