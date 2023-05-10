package com.damddos.sentinelweb.controller;

import com.damddos.sentinelmanager.projectTest.ProjectTestManager;
import com.damddos.sentinelservice.impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    StudentServiceImpl studentService;
    @RequestMapping("hello1/{s}")
    public String hello1(@PathVariable String s){
        return "hello "+ studentService.getStudentById(s);
    }
}
