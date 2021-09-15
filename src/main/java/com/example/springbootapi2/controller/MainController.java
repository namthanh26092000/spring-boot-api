package com.example.springbootapi2.controller;
import com.example.springbootapi2.entity.Students;
import com.example.springbootapi2.repository.StudentRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.springbootapi2.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api")
public class MainController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public List<Students> getAll(){
        return studentService.getAllStudents();
    }

    @GetMapping("/students/{id}")
    public Students findStudentById(@PathVariable("id") Long id){
        return studentService.getStudentById(id);
    }

    @PostMapping("/students")
    public void addStudent(@RequestBody Students student){
        studentService.addStudent(student);
    }

    @PostMapping("/students/{id}")
    public void delStudent(@PathVariable("id") Long id){
        studentService.delStudent(id);
    }

    @PutMapping("/students/{id}")
    public Students updateStudent(@PathVariable("id") Long id, @RequestBody Students student){
        return studentService.updateStudent(id, student);
    }
}
