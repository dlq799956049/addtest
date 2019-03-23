package com.dlq.test.controller;

import com.dlq.test.mapper.StudentMapper;
import com.dlq.test.po.Student;
import com.dlq.test.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController {
    @Autowired
    StudentMapper studentMapper;
    @Autowired
    StudentService studentService;
    @GetMapping("/student/{id}")
    @ResponseBody
    public Object selectStudent(@PathVariable int id){
        Student student ;
        try {
            //增加注释。
            student = studentService.selectStudent(id);
        }catch (Exception e){
           return e.getMessage();
       }
        return student;
    }

}
