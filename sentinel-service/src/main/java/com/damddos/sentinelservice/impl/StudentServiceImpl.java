package com.damddos.sentinelservice.impl;

import com.damddos.sentinelservice.StudentService;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    @Override
    public String getStudentById(String s) {
        return s+ " with service";
    }
}
