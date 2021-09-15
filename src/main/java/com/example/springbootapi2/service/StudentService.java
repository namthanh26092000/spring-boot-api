package com.example.springbootapi2.service;

import com.example.springbootapi2.entity.Students;

import java.util.List;

public interface StudentService {


    public List<Students> getAllStudents();
    public Students getStudentById(Long Id);
    public void addStudent(Students student);
    public void delStudent(Long id);
    public Students updateStudent(Long id, Students student);
}
