package com.xzit.service;

import com.xzit.mapper.StudentMapper;
import com.xzit.model.Student;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {

    private StudentMapper studentMapper;
    @Autowired
    public StudentServiceImpl(StudentMapper studentMapper) {
        this.studentMapper = studentMapper;
    }

    @Override
    public void save(Student student) {
            studentMapper.save(student);
    }

    @Override
    public List<Student> selectList() {
        return studentMapper.selectList();
    }

    @Override
    public void deleteById(int id) {
        studentMapper.deleteById(id);
    }

    @Override
    public void update(Student student) {
        studentMapper.update(student);
    }

    @Override
    public Student selectById(int id) {
        return studentMapper.selectById(id);
    }
}
