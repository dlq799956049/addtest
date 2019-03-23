package com.dlq.test.service.impl;

import com.dlq.test.mapper.StudentMapper;
import com.dlq.test.po.Student;
import com.dlq.test.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;
    @Override
    public Student selectStudent(int id) {
        if (id == 3){
            throw new RuntimeException("该条记录不能被查询");
        }
        Student student = studentMapper.selectByPrimaryKey(id);
        return student;
    }
}
