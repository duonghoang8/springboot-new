package com.example.springboot.model;
import jakarta.persistence.*;

@Entity

public class Score {
    @Id
    @Column(name = "idscore")
    private Long idscore;

    @Column(name = "namescore")
    private String namescore;

}
