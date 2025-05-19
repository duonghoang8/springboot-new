package com.example.springboot.service;

import com.example.springboot.model.Score;
import com.example.springboot.repository.ScoreRepository;
import com.example.springboot.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ScoreService {

    @Autowired
    private ScoreRepository scoreRepository;
    public List<Score> findAll() {
        return scoreRepository.findAll();
    }
    public Optional<Score> findById(Long id) {
        return scoreRepository.findById(id);
    }
    public Score save(Score score) {
        return scoreRepository.save(score);
    }
    public Score update(Score score) {
        return scoreRepository.save(score);
    }
    public void delete(Score score) {
        scoreRepository.delete(score);
    }
}
