package com.example.springboot.service;

import com.example.springboot.model.Student;
import com.example.springboot.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public List<Student> findAll() {
        for(Student student : studentRepository.findAll()) {
            System.out.println(student);
        }
        return studentRepository.findAll();
    }
    public Optional<Student> findByName(Long id) {
        return studentRepository.findById(id);
    }
    public Student save(Student student) {
        return studentRepository.save(student);
    }
    public void delete(Long id) {
        studentRepository.deleteById(id);
    }
    public Student update(Student student) {
        return studentRepository.save(student);
    }
}
