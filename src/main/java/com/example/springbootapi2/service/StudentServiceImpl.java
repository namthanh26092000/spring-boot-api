package com.example.springbootapi2.service;
import com.example.springbootapi2.entity.Students;
import com.example.springbootapi2.repository.StudentRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Students> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Students getStudentById(Long Id) {
        Students student = studentRepository.findById(Id).get();
        if(student == null)
            throw new RuntimeException("Didn't find student id: " + Id);
        return student;
    }

    @Override
    public void addStudent(Students student) {
        studentRepository.save(student);
    }

    @Override
    public void delStudent(Long id) {
        studentRepository.deleteById(id);
    }

    @Override
    public Students updateStudent(Long id, Students student) {
        Students studentDB = studentRepository.findById(id).get();
        studentDB.setName(student.getName());
        studentDB.setAddress(student.getAddress());
        studentDB.setAge(student.getAge());
        studentDB.setEmail(student.getEmail());
        studentDB.setClassName(student.getClassName());
        return studentDB;
    }
}
