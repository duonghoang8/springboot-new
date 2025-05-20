package com.example.springboot.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Score {
    @Id
    @Column(name = "idscore")
    private Long idscore;

    @Column(name = "namescore")
    private String namescore;


}
