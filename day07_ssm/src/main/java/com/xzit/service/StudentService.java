package com.xzit.service;

import com.xzit.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface StudentService {
    void save(Student student);
    List<Student> selectList();
    void deleteById(int id);
    void update(Student student);
    Student selectById(int id);
}
