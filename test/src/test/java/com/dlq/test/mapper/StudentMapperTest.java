package com.dlq.test.mapper;

import com.dlq.test.po.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentMapperTest {
    @Autowired
    private StudentMapper studentMapper;

    @Test
    public void testAdd(){
        Student student = new Student();
        student.setId(1);
        student.setName("sdf");
        student.setAge(19);
        studentMapper.insert(student);
    }

    @Test
    public void testSelectByName(){
        Student lll = studentMapper.selectByName("sdf");
        System.out.println(lll);
    }

}