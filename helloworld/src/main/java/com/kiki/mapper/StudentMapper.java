package com.kiki.mapper;

import com.kiki.pojo.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface StudentMapper {
    List<Student> queryStudentList();
    Student queryStudentById(int id);
    int addStudent(Student user);
    int updateStudent(Student user);
    int deleteStudent(int id);
}
