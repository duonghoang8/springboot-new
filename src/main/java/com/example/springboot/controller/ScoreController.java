package com.example.springboot.controller;


import com.example.springboot.model.Score;
import com.example.springboot.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/score")
public class ScoreController {
    @Autowired
    private ScoreService scoreService;
    @GetMapping
    public ResponseEntity<List<Score>> findAll() {
        return ResponseEntity.ok(scoreService.findAll());
    }
    @PutMapping
    public ResponseEntity<Score> update(@RequestBody Score score) {
        return ResponseEntity.ok(scoreService.update(score));
    }
    @PostMapping
    public ResponseEntity<Score> insert(@RequestBody Score score) {
        return ResponseEntity.ok(scoreService.save(score));
    }
    @DeleteMapping("/delete/{idscore}")
    public ResponseEntity<Score> delete(@PathVariable("idscore") Long idscore) {
        scoreService.deleteByID(idscore);
        return ResponseEntity.ok().build();
    }
}
