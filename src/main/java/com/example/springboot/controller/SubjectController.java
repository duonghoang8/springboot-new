package com.example.springboot.controller;

import com.example.springboot.model.Subject;
import com.example.springboot.service.SubjectService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/subject")
public class SubjectController {
    @Autowired
    private SubjectService subjectService;

    @GetMapping
    public ResponseEntity<List<Subject>> getSubject() {
        return ResponseEntity.ok(subjectService.findAll());
    }
    @PostMapping
    public ResponseEntity<Subject> createSubject(@RequestBody Subject subject) {
        return ResponseEntity.ok(subjectService.save(subject));
    }
    @PutMapping
    public ResponseEntity<Subject> updateSubject(@RequestBody Subject subject) {
        return ResponseEntity.ok(subjectService.save(subject));
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Subject> deleteSubject(@PathVariable Long id) {
        subjectService.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
