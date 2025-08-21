package com.xzit.controller;

import com.xzit.model.Student;
import com.xzit.service.StudentService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.List;

@Controller
public class StudentController {

    private StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    @RequestMapping("save")
    public String save(){
        return "save";
    }
    @PostMapping("saveCommit")
    public String saveCommit(Student student) {
        studentService.save(student);
        return "redirect:/select";
    }
    @RequestMapping("delete/{id}")
    public String delete(@PathVariable int id) {
        studentService.deleteById(id);
        return "redirect:/select";
    }

    @RequestMapping("update/form/{id}")
    public String update(@PathVariable int id,HttpServletRequest request) {
    Student student = studentService.selectById(id);
    request.setAttribute("student", student);
    return "update";
    }
    @PostMapping("updateCommit")
    public String updateCommit(Student student) {
        studentService.update(student);
        return "redirect:/select";
    }

    @RequestMapping("select")
    public String select(HttpServletRequest request) {
        List<Student> list = studentService.selectList();
        request.setAttribute("list", list);
        return "list";
    }


}
