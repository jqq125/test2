package com.kiki.service;

import com.kiki.pojo.Student;
import org.springframework.stereotype.Service;

import java.util.List;

interface StudentService {
    List<Student> queryStudentList();
    Student queryStudentById(int id);
    int addStudent(Student user);
    int updateStudent(Student user);
    int deleteStudent(int id);
}
