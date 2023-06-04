package com.kiki.controller;

import com.kiki.pojo.Student;
import com.kiki.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentServiceImpl studentService;

    @RequestMapping("/queryStudentList")
    public List<Student> queryStudentList(){
        List<Student> studentList=studentService.queryStudentList();
        for (Student Student : studentList) {
            System.out.println(Student);
        }
        return studentList;
    }

    @GetMapping("/queryStudentById/{id}")
    public String queryStudentById(@PathVariable("id") int id){
        Student Student=studentService.queryStudentById(id);
        System.out.println(Student);
        return "queryStudentById,ok!";
    }

    //添加一个用户
    @GetMapping("/addStudent")
    public String addStudent(){
        studentService.addStudent(new Student(4,"阿毛"));
        return "add,ok!";
    }

    //修改一个用户
    @GetMapping("/updateStudent")
    public String updateUser(){
        studentService.updateStudent(new Student(4,"阿三"));
        return "update,ok!";
    }

    //根据id删除用户
    @GetMapping("/deleteStudent")
    public String deleteUser(){
        studentService.deleteStudent(4);
        return "delete,ok!";
    }
}
