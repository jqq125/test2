package com.kiki.service;

import com.kiki.mapper.StudentMapper;
import com.kiki.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    StudentMapper studentMapper;

    @Override
    public List<Student> queryStudentList() {
        return studentMapper.queryStudentList();
    }

    @Override
    public Student queryStudentById(int id) {
        return studentMapper.queryStudentById(id);
    }

    @Override
    public int addStudent(Student student) {
        studentMapper.addStudent(student);
        return 0;
    }

    @Override
    public int updateStudent(Student student) {
        studentMapper.updateStudent(student);
        return 0;
    }

    @Override
    public int deleteStudent(int id) {
        studentMapper.deleteStudent(id);
        return 0;
    }
}
